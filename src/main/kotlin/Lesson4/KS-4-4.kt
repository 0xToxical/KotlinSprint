fun main() {

    val countOfDay = 5
    val armAndPress = countOfDay % 2 != 0
    val legsAndBack = countOfDay % 2 == 0

    println(
        """
        Упражнения для рук:    $armAndPress
        Упражнения для ног:    $legsAndBack
        Упражнения для пресса: $armAndPress
        Упражнения для спины:  $legsAndBack
        """.trimIndent()
    )

}