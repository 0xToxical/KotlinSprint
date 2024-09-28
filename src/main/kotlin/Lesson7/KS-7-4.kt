fun main() {
    println("Введите количество секунд для таймера:")
    val seconds = readln().toInt()

    for (remaining in seconds downTo 0) {
        println("Осталось секунд: $remaining")
        Thread.sleep(1000) // Пауза на 1 секунду
    }

    println("Время вышло")
}
