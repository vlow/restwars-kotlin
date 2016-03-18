package restwars.rest.controller

import restwars.business.building.BuildingService
import restwars.business.planet.PlanetService
import restwars.business.player.PlayerService
import restwars.rest.api.ConstructionSitesResponse
import restwars.rest.api.fromConstructionSites
import restwars.rest.base.AuthenticatedRestMethod
import restwars.rest.base.ControllerHelper
import restwars.rest.base.HttpMethod
import restwars.rest.base.RestMethod
import javax.validation.ValidatorFactory

class ConstructionSiteController(
        val validation: ValidatorFactory,
        val playerService: PlayerService,
        val planetService: PlanetService,
        val buildingService: BuildingService
) : ControllerHelper {
    fun listOnPlanet(): RestMethod<ConstructionSitesResponse> {
        return AuthenticatedRestMethod(HttpMethod.GET, "/v1/planet/:location/construction-site", ConstructionSitesResponse::class.java, playerService, { req, res, context ->
            val location = parseLocation(req)

            val planet = getOwnPlanet(planetService, context.player, location)
            val constructionSites = buildingService.findConstructionSitesByPlanet(planet)

            ConstructionSitesResponse.fromConstructionSites(constructionSites)
        })
    }
}