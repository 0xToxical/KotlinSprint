import kotlin.random.Random

fun main() {
    val winningNumbers = List(3) { Random.nextInt(0, 43) }

    println("Введите три числа от 0 до 42:")
    val userNumbers = List(3) { readln().toInt() }

    val matches = winningNumbers.intersect(userNumbers).size

    when (matches) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача! Вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: $winningNumbers")
}
