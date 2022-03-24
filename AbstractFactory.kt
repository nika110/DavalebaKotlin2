class VehicleFactory() {
    fun createAircraft(aircraftName: String?) : Aircraft? {
        return when (aircraftName) {
            "boeing737" -> AircraftFactory().create("Boeing737")
            "boeing777" -> AircraftFactory().create("Boeing777")
            else -> null
        }
    }

    fun createCar(aircraftName: String?) : Car? {
        return when (aircraftName) {
            "Audi" -> CarFactory().create("Audi")
            "Maserati" -> CarFactory().create("Maserati")
            else -> null
        }
    }
}
