fun main() {
    val ingredients = mutableSetOf<String>()

    while (ingredients.size < 5) {
        println("Введите ингредиент:")
        val ingredient = readln()
        ingredients.add(ingredient)
    }
    val sortedIngredients = ingredients.toList().sorted()

    val formattedIngredients = sortedIngredients.mapIndexed { index, ingredient ->
        if (index == 0) ingredient.replaceFirstChar { it.titlecase() } else ingredient.lowercase()
    }

    println("Ингредиенты: ${formattedIngredients.joinToString(", ")}")
}
