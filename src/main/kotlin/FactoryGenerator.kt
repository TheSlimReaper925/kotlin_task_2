class FactoryGenerator {
    companion object{
        fun getFactory(type: String): AbstractFactory? {
            return when(type){
                "AircraftFactory" -> AircraftFactory()
                "CarFactory" -> CarFactory()
                else -> null
            }
        }
    }
}