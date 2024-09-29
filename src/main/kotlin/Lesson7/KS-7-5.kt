fun main() {
    println("Введите число символов в пароле (не меньше 6):")
    var passwordLength = readln().toInt()

    if (passwordLength < 6) {
        passwordLength = 6
        println("Длина пароля должна быть не меньше 6 символов. Пароль будет длиной $passwordLength символов.")
    }

    val password = mutableListOf<Char>()

    val numbers = ('0'..'9')
    val lowerCaseLetters = ('a'..'z')
    val upperCaseLetters = ('A'..'Z')

    password.add(numbers.random())
    password.add(lowerCaseLetters.random())
    password.add(upperCaseLetters.random())

    val allCharacters = numbers + lowerCaseLetters + upperCaseLetters

    for (i in 4..passwordLength) {
        password.add(allCharacters.random())
    }

    password.shuffle()

    println("Сгенерированный пароль: ${password.joinToString("")}")
}
