fun main() {
    println("Докажи, что ты не бот, реши задачку:5+4")
    val a: Int = 5
    val b: Int = 4
    val answerTask = a+b
    val example = readln().toInt()

    val resultText = if (example == answerTask) ("Добро пожаловать") else ("Доступ запрещен")
    println(resultText)
}