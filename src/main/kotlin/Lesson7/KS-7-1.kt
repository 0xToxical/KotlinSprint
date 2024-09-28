fun main() {
    val numbers = ('0'..'9')
    val lowerCaseLetters = ('a'..'z')

    var password = ""

    repeat(6) {
        when ((1..2).random()) {
            1 -> password += numbers.random()
            2 -> password += lowerCaseLetters.random()
        }
    }

    println("Сгенерированный пароль: $password")
}
