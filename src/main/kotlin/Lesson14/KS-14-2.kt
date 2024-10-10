open class LinerShipV2(
    val name: String,
    val speed: Int,
    val capacity: Int,
) {
    open fun loadCargo() {
        println("$name: Выдвигается горизонтальный трап со шкафута")
    }

    fun printShipInfo() {
        println("Название: $name \nСкорость: $speed \nВместимость: $capacity")
    }
}

class CargoShipV2(
    name: String,
    speed: Int = 30,
    capacity: Int = 1000,
) : LinerShipV2(name, speed, capacity) {

    override fun loadCargo() {
        println("$name: Активируется погрузочный кран")
    }
}

class IcebreakerShipV2(
    name: String,
    speed: Int = 20,
    capacity: Int = 500,
) : LinerShipV2(name, speed, capacity) {

    override fun loadCargo() {
        println("$name: Открываются ворота со стороны кормы")
    }
}

fun main() {
    val linerV2 = LinerShipV2("Лайнер", 40, 2000)
    val cargoV2 = CargoShipV2("Грузовой")
    val icebreakerV2 = IcebreakerShipV2("Ледокол")

    linerV2.loadCargo()
    cargoV2.loadCargo()
    icebreakerV2.loadCargo()

    println()
    linerV2.printShipInfo()
    println()
    cargoV2.printShipInfo()
    println()
    icebreakerV2.printShipInfo()
}
