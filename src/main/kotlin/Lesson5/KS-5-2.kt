fun main() {
    val birthYear = readln(). toInt()
    val userAge = CURRENT_YEAR - birthYear

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"

    println(resultText)
}

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR: Int = 2024