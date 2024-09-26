import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 10)
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
