class QuizItem (question: String, answer: String) {
    var question = question
        get() = field

    var answer = answer
        get() = field
        set (value) {
            field = value
        }
}

fun main() {
    val quiz = QuizItem("Столица России?", "Москва")

    println("Question: ${quiz.question}")
    println("Answer: ${quiz.answer}")

    quiz.answer = "Питер"
    println("Updater Answer: ${quiz.answer}")
}