fun main() {
    println("Введите логин, не менее 4-х символов")
    val login = readln()
    println("Введите пароль, не менее 4-х символов")
    val password = readln()

    if (login.hasValidLength(4) && password.hasValidLength(4)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun String.hasValidLength(minLength: Int) = this.length >= minLength
