fun main() {
    println("Введите число планируемых ингредиентов:")
    var numberOfIngr = readln() .toInt()

    val ingredients = Array(numberOfIngr) {""}

    for (i in ingredients.indices) {
        println("Введите ингредиент №${i + 1}:")
        ingredients[i] = readln()
    }
    println("Ваши ингредиенты: ${ingredients.joinToString(", ")}")
}