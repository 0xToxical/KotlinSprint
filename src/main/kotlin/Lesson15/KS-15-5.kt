interface PassengerTransport {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(count: Int) {
        if (currentPassengers + count > maxPassengers) {
            println("Не удается загрузить $count пассажиров. Максимум: $maxPassengers")
        } else {
            currentPassengers += count
            println("Загружено $count пассажиров. Текущие пассажиры: $currentPassengers")
        }
    }

    fun unloadPassengers(count: Int) {
        if (count > currentPassengers) {
            println("Нельзя выгрузить больше пассажиров, чем есть: $currentPassengers")
        } else {
            currentPassengers -= count
            println("Выгружено $count пассажиров. Осталось пассажиров: $currentPassengers")
        }
    }
}

interface CargoTransport {
    val maxCargo: Double
    var currentCargo: Double

    fun loadCargo(amount: Double) {
        if (currentCargo + amount > maxCargo) {
            println("Не удается загрузить $amount тонн груза. Максимум: $maxCargo тонн.")
        } else {
            currentCargo += amount
            println("Загружено $amount тонн груза. Текущий груз: $currentCargo тонн.")
        }
    }

    fun unloadCargo(amount: Double) {
        if (amount > currentCargo) {
            println("Нельзя выгрузить больше груза, чем есть: $currentCargo тонн.")
        } else {
            currentCargo -= amount
            println("Выгружено $amount тонн груза. Осталось: $currentCargo тонн.")
        }
    }
}

class Truck : PassengerTransport, CargoTransport {
    override val maxPassengers = 1
    override var currentPassengers = 0
    override val maxCargo = 2.0
    override var currentCargo = 0.0
}

class Car : PassengerTransport {
    override val maxPassengers = 3
    override var currentPassengers = 0
}

fun main() {
    val truck = Truck()
    val car1 = Car()
    val car2 = Car()

    car1.loadPassengers(3)
    car1.unloadPassengers(3)
    car2.loadPassengers(3)
    car2.unloadPassengers(3)

    truck.loadCargo(2.0)
    truck.unloadCargo(2.0)
}
