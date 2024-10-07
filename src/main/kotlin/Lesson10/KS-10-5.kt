const val LOGIN = "correctLogin"
const val PASSWORD = "correctPassword"
val basketItems = mutableListOf("item1", "item2", "item3")

fun main() {
    println("Введите логин")
    val userLogin = readln()
    println("Введите пароль")
    val userPassword = readln()

    val token = authorize(userLogin, userPassword)

    if (token != null) {
        println("Авторизация успешна! Ваш токен: $token")
        val basket = getBasket(token)
        printBasketContents(basket)
    } else {
        println("Ошибка авторизации: Логин или пароль неверные.")
    }
}

fun authorize(userLogin: String, userPassword: String): String? {
    return if (userLogin == LOGIN && userPassword == PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val tokenLength = 32
    val characters = (('a'..'z') + ('A'..'Z') + ('0'..'9')).toList()
    return (1..tokenLength).map { characters.random() }.joinToString("")
}

fun getBasket(token: String): List<String>? {
    return if (token.isNotEmpty()) {
        basketItems
    } else {
        null
    }
}

fun printBasketContents(basket: List<String>?) {
    if (basket == null || basket.isEmpty()) {
        println("Корзина пуста.")
    } else {
        println("Содержимое корзины:")
        basket.forEach { item ->
            println("- $item")
        }
    }
}
