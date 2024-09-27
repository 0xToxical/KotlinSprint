fun main() {
    val password = StringBuilder()

    for (i in 1..6) {
        if (i % 2 == 0) {
            val number = (0..9).random()
            password.append(number)
        } else {
            val letter = ('a'..'z').random()
            password.append(letter)
        }
    }

    println("Сгенерированный пароль: $password")
}
