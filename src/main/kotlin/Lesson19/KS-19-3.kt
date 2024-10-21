class Spaceship {
    fun takeOff() {
        println("Космический корабль взлетел!")
    }
    fun land() {
        println("Космический корабль приземлился.")
    }
    fun shoot() {
        //todo: Реализовать логику стрельбы.
        println("Космический корабль стреляет!")
    }
    fun emergencyLanding() {
        throw NotImplementedError("Необходима логика для экстренной посадки.")
    }
}

fun main() {
    val spaceship = Spaceship()

    spaceship.takeOff()
    spaceship.land()
    spaceship.shoot()
    spaceship.emergencyLanding()
}