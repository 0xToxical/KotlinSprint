const val LOGIN = "correctLogin"
const val PASSWORD = "correctPassword"

fun main() {
    println("Введите логин")
    val userLogin = readln()
    println("Введите пароль")
    val userPassword = readln()

    val token = authorization(userLogin, userPassword)

    if (token != null) {
        println("Авторизация успешна! Ваш токен: $token")
    } else {
        println("Ошибка авторизации: Логин или пароль неверные.")
    }
}

fun authorization(userLogin: String, userPassword: String): String? {
    return if (userLogin == LOGIN && userPassword == PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    return (1..32)
        .map { characters.random() }
        .joinToString("")
}
