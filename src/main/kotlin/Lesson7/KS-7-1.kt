fun main() {
    var password = ""

    val numberRange = 0..9
    val lowerCaseRange = 'a'..'z'
    val upperCaseRange = 'A'..'Z'

    for (i in 1..6) {
        when ((1..3).random()) {
            1 -> password += numberRange.random()
            2 -> password += lowerCaseRange.random()
            3 -> password += upperCaseRange.random()
        }
    }

    println("Сгенерированный пароль: $password")
}
