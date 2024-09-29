fun main() {
    println("Введите число планируемых ингредиентов:")
    val numberOfIngredients = readln().toInt()

    val ingredients = mutableListOf<String>()

    for (i in 1..numberOfIngredients) {
        println("Введите ингредиент №$i:")
        val ingredient = readln()
        ingredients.add(ingredient)
    }

    println("Ваши ингредиенты: ${ingredients.joinToString(", ")}")
}
