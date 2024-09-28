fun main() {
    val secretNumber = (1..9).random()
    var attempts = 5

    println("Угадай число от 1 до 9, у Вас есть $attempts попыток.")

    do {
        println("Введите число:")
        val userNumber = readln().toInt()

        if (secretNumber == userNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверное число. Осталось попыток ${--attempts}")
        }
    } while (attempts > 0)

    println("Было загадано число $secretNumber.")
}
