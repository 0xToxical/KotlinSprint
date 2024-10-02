fun main() {
    val password = generatePassword()
    println("Сгенерированный пароль: $password")
}

fun generatePassword (): String {
    println("Введите желаемую длину пароля")
    var password = ""
    var lengthOfPassword = readln() .toInt()
    val numberRange = 0..9
    val specialChars = arrayOf ('!', '@', '#','$', '%', '&','\'' , '(', ')','*', '+', ',', '-', '.', '/' ,' ')

    for (i in 1..lengthOfPassword) {
        if (i % 2 == 0) {
            password += numberRange.random()
        } else {
            password += specialChars.random()
        }
    }
    return password.toString()
}