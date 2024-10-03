fun main() {

    val userThrow = rollDice()
    println("Бросок пользователя: $userThrow")
    val compThrow: Int = rollDice()
    println("Бросок компьютера: $compThrow")

    when {
        userThrow > compThrow -> println("Победило человечество!")
        compThrow > userThrow -> println("Победила машина!")
        else -> println("Ничья")
    }

}

fun rollDice(): Int = (1..6).random()

