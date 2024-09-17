const val numberOfTables = 13

fun main() {

    val today = 13
    val tomorrow = 9
    val comparisonResult = today < numberOfTables
    val comparisonResult2 = tomorrow < numberOfTables

    println("Доступность столиков на сегодня: $comparisonResult\nДоступность столиков на завтра: $comparisonResult2")
}