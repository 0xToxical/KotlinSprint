const val MIN_LENGTH = 4 // Константа для минимальной длины

fun main() {
    println("Введите логин, не менее $MIN_LENGTH символов")
    val login = readln()
    println("Введите пароль, не менее $MIN_LENGTH символов")
    val password = readln()

    if (login.hasValidLength(MIN_LENGTH) && password.hasValidLength(MIN_LENGTH)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}
fun String.hasValidLength(minLength: Int) = this.length >= minLength
