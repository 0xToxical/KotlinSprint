fun main() {
    println("Докажи, что ты не бот, реши задачку:5+4")
    val example = readln().toInt()

    val resultText = if (example == 9) ("Добро пожаловать") else ("Доступ запрещен")
    println(resultText)
}