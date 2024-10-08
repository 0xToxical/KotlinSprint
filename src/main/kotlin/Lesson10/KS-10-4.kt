fun main() {
    var answer: String

    do {
        val userThrow = rollDice()
        val compThrow = rollDice()
        println("Бросок пользователя $userThrow")
        println("Бросок компьютера $compThrow")

        compareThrows(userThrow, compThrow)

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        answer = readln().trim().lowercase()
    } while (answer == "да")
}

fun rollDice(): Int = (1..7).random()


fun compareThrows(userThrow: Int, compThrow: Int) {
    when {
        userThrow > compThrow -> println("Победило человечество!")
        compThrow > userThrow -> println("Победила машина!")
        else -> println("Ничья")
    }
}
