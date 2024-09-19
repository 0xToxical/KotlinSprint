fun main() {

    val countOfDay = 5
    val armAndPressDay = countOfDay % 2 != 0

    println(
        """
        Упражнения для рук:    $armAndPressDay 
        Упражнения для ног:    ${!armAndPressDay}
        Упражнения для пресса: $armAndPressDay
        Упражнения для спины:  ${!armAndPressDay}
        """.trimIndent()
    )

}