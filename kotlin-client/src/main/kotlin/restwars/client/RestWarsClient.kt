package restwars.client

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import feign.Feign
import feign.Headers
import feign.Param
import feign.RequestLine
import feign.auth.BasicAuthRequestInterceptor
import feign.jackson.JacksonDecoder
import feign.jackson.JacksonEncoder
import feign.slf4j.Slf4jLogger
import restwars.rest.api.*

open class RestWarsClient(val hostname: String, val port: Int) {
    protected val httpBaseUrl = "http://$hostname:$port/"
    private val websocketBaseUrl = "ws://$hostname:$port/"

    private val mapper = ObjectMapper()
            .registerModule(KotlinModule())
            .configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false)

    private val client: Restwars = feignBuilder()
            .target(Restwars::class.java, httpBaseUrl)

    private val roundWebsocket = WebSocket(mapper, RoundResponse::class.java, websocketBaseUrl + "v1/round/websocket")
    private val tournamentWebsocket = WebSocket(mapper, SuccessResponse::class.java, websocketBaseUrl + "v1/tournament/websocket")

    @Headers("Content-Type: application/json", "Accept: application/json")
    interface Restwars {
        @RequestLine("POST /v1/player")
        fun createPlayer(request: CreatePlayerRequest)

        @RequestLine("GET /v1/planet")
        fun listPlanets(): PlanetsResponse

        @RequestLine("GET /v1/player/fight")
        fun listFights(): FightsResponse

        @RequestLine("GET /v1/player/fight?since={since}")
        fun listFights(@Param("since") since: Long): FightsResponse

        @RequestLine("GET /v1/planet/{location}/fight")
        fun listFightsWithPlanet(@Param("location") location: String): FightsResponse

        @RequestLine("GET /v1/planet/{location}/fight?since={since}")
        fun listFightsWithPlanet(@Param("location") location: String, @Param("since") since: Long): FightsResponse

        @RequestLine("POST /v1/planet/{location}/telescope/scan")
        fun telescopeScan(@Param("location") location: String): ScanResponse

        @RequestLine("GET /v1/restwars")
        fun applicationInformation(): ApplicationInformationResponse

        @RequestLine("GET /v1/configuration")
        fun restwarsConfiguration(): ConfigResponse

        @RequestLine("GET /v1/round")
        fun roundInformation(): RoundWithRoundTimeResponse

        @RequestLine("GET /v1/round/wait")
        fun waitForNextRound(): RoundResponse

        @RequestLine("GET /v1/planet/{location}/building")
        fun listBuildings(@Param("location") location: String): BuildingsResponse

        @RequestLine("POST /v1/planet/{location}/building")
        fun constructBuilding(@Param("location") location: String, request: BuildBuildingRequest): ConstructionSiteResponse

        @RequestLine("GET /v1/planet/{location}/construction-site")
        fun listConstructionSites(@Param("location") location: String): ConstructionSitesResponse

        @RequestLine("GET /v1/planet/{location}/hangar")
        fun listShipsInHangar(@Param("location") location: String): ShipsResponse

        @RequestLine("POST /v1/planet/{location}/hangar")
        fun constructShip(@Param("location") location: String, request: BuildShipRequest): ShipInConstructionResponse

        @RequestLine("GET /v1/planet/{location}/shipyard")
        fun listShipsInConstruction(@Param("location") location: String): ShipsInConstructionResponse

        @RequestLine("POST /v1/planet/{location}/flight")
        fun startFlight(@Param("location") location: String, request: CreateFlightRequest): FlightResponse

        @RequestLine("GET /v1/flight")
        fun listFlights(): FlightsResponse

        @RequestLine("GET /v1/flight/to/{location}")
        fun listFlightsWithDestination(@Param("location") location: String): FlightsResponse

        @RequestLine("GET /v1/flight/from/{location}")
        fun listFlightsWithStart(@Param("location") location: String): FlightsResponse

        @RequestLine("GET /v1/flight/detected")
        fun listDetectedFlights(): DetectedFlightsResponse

        @RequestLine("GET /v1/flight/detected?since={since}")
        fun listDetectedFlights(@Param("since") since: Long): DetectedFlightsResponse

        @RequestLine("GET /v1/event")
        fun listEvents(): EventsResponse

        @RequestLine("GET /v1/event?since={since}")
        fun listEvents(@Param("since") since: Long): EventsResponse

        @RequestLine("GET /v1/metadata/ship")
        fun listShipMetadata(): ShipsMetadataResponse

        @RequestLine("GET /v1/metadata/building")
        fun listBuildingMetadata(): BuildingsMetadataResponse

        @RequestLine("GET /v1/tournament/wait")
        fun waitForTournamentStart(): SuccessResponse

        @RequestLine("GET /v1/points")
        fun listsPoints(): PointsResponse
    }

    fun createPlayer(username: String, password: String) {
        client.createPlayer(CreatePlayerRequest(username, password))
    }

    fun applicationInformation(): ApplicationInformationResponse = client.applicationInformation()

    fun restwarsConfiguration(): ConfigResponse = client.restwarsConfiguration()

    fun roundInformation(): RoundWithRoundTimeResponse = client.roundInformation()

    fun waitForNextRound(): RoundResponse = client.waitForNextRound()

    fun listShipMetadata(): ShipsMetadataResponse = client.listShipMetadata()

    fun listBuildingMetadat(): BuildingsMetadataResponse = client.listBuildingMetadata()

    fun waitForTournamentStart(): SuccessResponse = client.waitForTournamentStart()

    fun listsPoints(): PointsResponse = client.listsPoints()

    fun withCredentials(username: String, password: String): AuthenticatingRestWarsClient {
        return AuthenticatingRestWarsClient(hostname, port, username, password)
    }

    /**
     * Adds a [callback] which is called on the start of a new round.
     */
    fun addRoundCallback(callback: WebsocketCallback<RoundResponse>) {
        roundWebsocket.addCallback(callback)
    }

    /**
     * Adds a [callback] which is called on the start of a new round.
     */
    fun addRoundCallback(callback: (RoundResponse) -> Unit) {
        addRoundCallback(object : WebsocketCallback<RoundResponse> {
            override fun call(response: RoundResponse) {
                callback(response)
            }
        })
    }

    /**
     * Removes a round [callback].
     */
    fun removeRoundCallback(callback: WebsocketCallback<RoundResponse>) {
        roundWebsocket.removeCallback(callback)
    }

    /**
     * Adds a [callback] which is called on the start of the tournament.
     */
    fun addTournamentCallback(callback: WebsocketCallback<SuccessResponse>) {
        tournamentWebsocket.addCallback(callback)
    }

    /**
     * Adds a [callback] which is called on the start of the tournament.
     */
    fun addTournamentCallback(callback: (SuccessResponse) -> Unit) {
        addTournamentCallback(object : WebsocketCallback<SuccessResponse> {
            override fun call(response: SuccessResponse) {
                callback(response)
            }
        })
    }

    /**
     * Removes a tournament [callback].
     */
    fun removeTournamentCallback(callback: WebsocketCallback<SuccessResponse>) {
        tournamentWebsocket.removeCallback(callback)
    }

    protected fun feignBuilder(): Feign.Builder {
        return Feign.builder()
                .encoder(JacksonEncoder(mapper))
                .decoder(JacksonDecoder(mapper))
                .logger(Slf4jLogger())
    }
}

class AuthenticatingRestWarsClient(hostname: String, port: Int, val username: String, val password: String) : RestWarsClient(hostname, port) {
    private val client: Restwars = feignBuilder()
            .requestInterceptor(BasicAuthRequestInterceptor(username, password))
            .target(Restwars::class.java, httpBaseUrl)

    fun listPlanets(): PlanetsResponse = client.listPlanets()

    fun listFights(): FightsResponse = client.listFights()

    fun listFightsWithPlanet(location: String): FightsResponse = client.listFightsWithPlanet(location)

    fun telescopeScan(location: String): ScanResponse = client.telescopeScan(location)

    fun listBuildings(location: String): BuildingsResponse = client.listBuildings(location)

    fun constructBuilding(location: String, type: String): ConstructionSiteResponse = client.constructBuilding(location, BuildBuildingRequest(type))

    fun listConstructionSites(location: String): ConstructionSitesResponse = client.listConstructionSites(location)

    fun listShipsInHangar(location: String): ShipsResponse = client.listShipsInHangar(location)

    fun constructShip(location: String, type: String): ShipInConstructionResponse = client.constructShip(location, BuildShipRequest(type))

    fun listShipsInConstruction(location: String): ShipsInConstructionResponse = client.listShipsInConstruction(location)

    fun startFlight(location: String, destination: String, ships: ShipsRequest, type: String, cargo: CargoRequest): FlightResponse = client.startFlight(location, CreateFlightRequest(destination, ships, type, cargo))

    fun listFlights() = client.listFlights()

    fun listFlightsWithDestination(location: String) = client.listFlightsWithDestination(location)

    fun listFlightsWithStart(location: String) = client.listFlightsWithStart(location)

    fun listFights(since: Long): FightsResponse = client.listFights(since)

    fun listFightsWithPlanet(location: String, since: Long): FightsResponse = client.listFightsWithPlanet(location, since)

    fun listDetectedFlights(): DetectedFlightsResponse = client.listDetectedFlights()

    fun listDetectedFlights(since: Long): DetectedFlightsResponse = client.listDetectedFlights(since)

    fun listEvents(): EventsResponse = client.listEvents()

    fun listEvents(since: Long): EventsResponse = client.listEvents(since)
}