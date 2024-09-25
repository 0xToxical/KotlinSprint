fun main() {
    println("Введите количество секунд:")
    val seconds = readln().toInt()
    var counter = 0
    while (counter != seconds) {
        println("Осталось секунд: ${seconds - counter}")
        Thread.sleep(seconds * 1000L)
        counter++
    }
    println("Время вышло")
}
