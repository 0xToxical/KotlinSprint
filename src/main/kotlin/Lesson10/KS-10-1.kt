import kotlin.random.Random

fun main() {

    val userThrow = rollDice()
    println("Бросок пользователя: $userThrow")
    val compThrow: Int = rollDice()
    println("Бросок компьютера: $compThrow")

    when {
        userThrow > compThrow -> println("Победило человечество!")
        compThrow > userThrow -> println("Победила машина!")
        else ->println("Ничья")
    }

}

fun rollDice(): Int {
    return Random.nextInt(1,7)
}
