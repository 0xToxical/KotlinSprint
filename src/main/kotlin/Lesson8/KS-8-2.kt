fun main() {

    val ingridients = arrayOf("масло", "рис", "мясо", "лук", "морковь")
    println("Какой ингридиент надо найти?")
    val userIngr = readln()
    var found = false

    for (ingridient in ingridients) {
        if (ingridient.equals(userIngr, ignoreCase = true)) {
            found = true
            break
        }
    }
        if (found) {
            println("Ингридиент \"$userIngr\" в рецепте есть")
        } else {
            println("Такого ингредиента в рецепте нет")
        }
}