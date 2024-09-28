fun main() {
    val ingredients = arrayOf("масло", "рис", "мясо", "лук", "морковь")
    println("Какой ингредиент надо найти?")
    val userIngredient = readln()

    if (userIngredient in ingredients) {
        println("Ингредиент $userIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
