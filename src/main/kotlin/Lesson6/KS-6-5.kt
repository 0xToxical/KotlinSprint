fun main() {
    var attempts = 3

    do {
        val rndmNumber1 = (1..9).random()
        val rndmNumber2 = (1..9).random()
        val trueAnswer = rndmNumber1 + rndmNumber2

        println("Докажите, что Вы не бот, решите задачку: $rndmNumber1 + $rndmNumber2 = ?")

        while (attempts > 0) {
            val answer = readln().toInt()
            if (answer == trueAnswer) {
                println("Добро пожаловать!")
                return
            } else {
                attempts--
                println("Неверно, осталось попыток $attempts")
                if (attempts > 0) {
                    println("Попробуйте еще раз: $rndmNumber1 + $rndmNumber2 = ?")
                }
            }
        }
        if (attempts == 0) {
            println("Доступ запрещен")
        }
    } while (attempts > 0)
}




