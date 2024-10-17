class Ship(name: String, var averageSpeed: Double, var homePort: String) {
    var name: String = name
        get() = field
        set(value) {
            if (value != field) {
                throw IllegalArgumentException("Ошибка: Имя корабля не может быть изменено!")
            }
        }
}

fun main() {
    val ship = Ship("Победоносный", 60.0, "Санкт-Петербург")

    println("Имя корабля: ${ship.name}")
    println("Средняя скорость: ${ship.averageSpeed}")
    println("Порт приписки: ${ship.homePort}")

    try {
        ship.name = "Гопник Питерский"
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println("Имя корабля после попытки изменения: ${ship.name}")
}
