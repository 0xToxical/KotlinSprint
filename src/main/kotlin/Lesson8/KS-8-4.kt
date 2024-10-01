fun main() {
    var ingredients = arrayOf("масло", "рис", "мясо", "лук", "морковь")
    println("Текущий список ингридиентов:")
    ingredients.forEach { println(it) }

    println("Какой ингридиент хотите изменить?")
    var oldIngredient = readln()

    val index = ingredients.indexOf(oldIngredient)

    if (index != -1) {
        println("Введите новый ингридиент:")
        val newIngridient = readln()

        ingredients[index] = newIngridient

        println("Готово, вы сохранили следующий список:${ingredients.joinToString(", ")}")

    } else {
        println("Такого ингридиента в списке нет.")
    }
}

