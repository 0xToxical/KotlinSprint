fun main() {
    println("Для регистрации, введите логин")
    val regLogin = readln()
    println("Введите пароль")
    val regPassword = readln()

    println("Вы успешно зарегистрировались!")

    var login: String
    var password: String

    do {
        println("Введите логин")
        login = readln()
        println("Введите пароль")
        password = readln()

        if (login != regLogin || password != regPassword) {
            println("Неправильный логин или пароль, попробуйте еще раз")
        }
    } while (login != regLogin || password != regPassword)

    println("Успешная авторизация")
}
