package restwars.rest.api

enum class ErrorReason {
    REQUEST_VALIDATION_FAILED,
    INVALID_CREDENTIALS,
    LOCATION_VARIABLE_MISSING,
    ADMIN_ACCOUNT_REQUIRED,
    PLANET_NOT_FOUND,
    UNPROCESSABLE_ENTITY,
    TOURNAMENT_NOT_STARTED,
    LOCATION_PARSING_FAILED,
    NOT_ENOUGH_BUILD_SLOTS_AVAILABLE,
    BUILDING_TYPE_ALREADY_IN_PROGRESS,
    NOT_ENOUGH_RESOURCES,
    SAME_START_AND_DESTINATION,
    NO_SHIPS_ON_FLIGHT,
    NOT_ENOUGH_SHIPS_AVAILABLE,
    COLONY_SHIP_REQUIRED,
    CARGO_NOT_ALLOWED,
    ENERGY_IN_CARGO_NOT_ALLOWED,
    NOT_ENOUGH_CARGO_AVAILABLE,
    INVALID_LOCATION,
    USERNAME_ALREADY_EXISTS,
    NO_SHIPYARD,
    NO_TELESCOPE
}