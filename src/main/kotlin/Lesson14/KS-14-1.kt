open class Liner(
    val name: String,
    val speed: Int,
    val capacity: Int
) {
    fun printInfo() {
        println("Название: $name \nСкорость: $speed \nВместимость: $capacity")
    }
}

class CargoShip(
    name: String,
    speed: Int = 20,
    capacity: Int = 5000,
    val cargoCapacity: Int = 10000
) : Liner(name, speed, capacity) {
    fun printCargoInfo() {
        println("Грузоподъемность: $cargoCapacity")
    }
}

class Icebreaker(
    name: String,
    speed: Int = 10,
    capacity: Int = 1000
) : Liner(name, speed, capacity) {
    fun breakIce() {
        println("$name колет лёд")
    }
}

fun main() {
    val liner = Liner("Лайнер", 30, 3000)
    val cargoShip = CargoShip("Грузовой корабль")
    val icebreaker = Icebreaker("Ледокол")

    liner.printInfo()
    println()

    cargoShip.printInfo()
    cargoShip.printCargoInfo()
    println()

    icebreaker.printInfo()
    icebreaker.breakIce()
}
