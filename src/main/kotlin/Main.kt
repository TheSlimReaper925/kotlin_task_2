fun main(){
    //task 1
    var point1: Point = Point(0.0, 0.0)
    var point2: Point = Point(1.0, 1.0)
    println(point1)
    println(point2)
    println(point1.equals(point2))
    point2.symmetricToO()
    println(point2)
    println(point1.distanceBetweenPoints(point2))


    //task 2

    var car = FactoryGenerator.getFactory("CarFactory")?.create("Audi")
    var aircraft = FactoryGenerator.getFactory("AircraftFactory")?.create("Boeing737")
    println(car)
    println(aircraft)
}