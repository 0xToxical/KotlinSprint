fun main() {
    val minLength = 4
    println("Введите логин, не менее 4х символов")
    val login = readln()
    println("Введите пароль, не менее 4х символов")
    val password = readln()

    if (login.length >= minLength && password.length >= minLength) {
        println("Добро пожаловать!")

    }else{println("Логин или пароль недостаточно длинные")
        }


}