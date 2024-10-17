class Package(val trackingNumber: Int, currentLocation: String) {
    private var moveCounter = 0

    var currentLocation = currentLocation
        set(value) {
            field = value
            moveCounter++
        }

    fun printStatus() {
        println("Посылка с номером $trackingNumber")
        println("Текущее положение посылки: $currentLocation")
        println("Количество перемещений: $moveCounter")
    }
}

fun main() {
    val container = Package(555, "Москва")
    container.printStatus()

    container.currentLocation = "Санкт-Петербург"
    container.printStatus()

    container.currentLocation = "Мурманск"
    container.printStatus()

}