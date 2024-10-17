class User(login: String, password: String) {
    var login: String = login
        set(value) {
            field = value
            println("Логин успешно изменен на $value")
        }
    var password: String = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user = User("testUser", "testPassword")

    println("Пароль:${user.password}")
    user.password = "NewPassword"
    user.login = "NewLogin"
    println("Логин :${user.login}")
    println("Пароль :${user.password}")
}