fun main() {
    println("Введите желаемую длину пароля")
    var lengthOfPassword = readln().toInt()
    val password = generatePassword(lengthOfPassword)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(lengthOfPassword: Int): String = buildString {
    val numberRange = 0..9
    val specialChars = arrayOf('!', '@', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ')

    for (i in 1..lengthOfPassword) {
        if (i % 2 == 0) {
            append(numberRange.random())
        } else {
            append(specialChars.random())
        }
    }
}