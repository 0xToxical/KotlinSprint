fun main() {
    println("Введите количество секунд:")
    var seconds = readln().toInt()
    while (seconds > 0) {
        println("Осталось секунд: $seconds")
        Thread.sleep(seconds * 1000L)
        seconds--
    }
    println("Время вышло")
}
