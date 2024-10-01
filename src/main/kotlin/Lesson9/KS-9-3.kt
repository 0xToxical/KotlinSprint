fun main() {
    val EGGS_INDEX = 0
    val MILK_INDEX = 1
    val BUTTER_INDEX = 2

    val omletOnePortion = listOf(2, 50, 15)

    println("Сколько порций хотите приготовить?")
    val numberOfPortion = readln().toInt()

    val ingredientsForPortions = omletOnePortion.map { it * numberOfPortion }

    println("На $numberOfPortion порций, понадобится: " +
            "яиц - ${ingredientsForPortions[EGGS_INDEX]}, " +
            "молока - ${ingredientsForPortions[MILK_INDEX]}, " +
            "масла - ${ingredientsForPortions[BUTTER_INDEX]}")
}
