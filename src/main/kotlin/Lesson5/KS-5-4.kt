fun main() {

    val registeredUsername = "Zaphod"
    val registeredPassword = "PanGalactic"

    println("[вздыхает...] Введи, пожалуйста, свое имя пользователя:")

    val enteredUsername = readln()

    if (enteredUsername == registeredUsername) {
        println("[вздыхает ещё глубже...] Введи пароль, чтобы мы могли продолжить этот мучительный процесс:")

        val enteredPassword = readln()
        if (enteredPassword == registeredPassword) {
            println("[вздыхает...] Ваши данные проверены, и о, чудо, они верны...Пользователь Zaphod, вам разрешено входить на борт корабля Heart of Gold")
        } else {
            println("[вздыхает...]пароль неверный. Доступ запрещён.")
        }
    } else {
        println("[вздыхает...] Пользователь не найден... Может, вам стоит зарегистрироваться?")
    }
}
