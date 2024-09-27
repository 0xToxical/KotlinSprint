fun main() {

    println("Введите число символов в пароле (не меньше 6):")
    var passwordLength = readln().toInt()

    if (passwordLength < 6) {
        passwordLength = 6
        println("Длина пароля должна быть не меньше 6 символов. Пароль будет длиной $passwordLength символов.")
    }

    val password = StringBuilder()
    for (i in 1..passwordLength) {
        when ((1..3).random()) {
            1 -> password.append((0..9).random())
            2 -> password.append(('a'..'z').random())
            3 -> password.append(('A'..'Z').random())
        }
    }

    println("Сгенерированный пароль: $password")
}