fun main() {

    val ingridients = arrayOf("масло", "рис", "мясо", "лук", "морковь")
    println("Какой ингридиент надо найти?")
    val userIngr = readln()

    if (ingridients.any { it.equals(userIngr, ignoreCase = true) }) {
        println("Ингредиент $userIngr в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}