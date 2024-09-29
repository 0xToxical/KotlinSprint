fun main() {
    var password = ""

    val numberRange = 0..9
    val letterRange = 'a'..'z'

    for (i in 1..6) {
        if (i % 2 == 0) {
            password += numberRange.random()
        } else {
            password += letterRange.random()
        }
    }

    println("Сгенерированный пароль: $password")
}
