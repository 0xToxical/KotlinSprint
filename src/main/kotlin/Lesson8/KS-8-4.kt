fun main() {

    var ingredients = arrayOf("масло", "рис", "мясо", "лук", "морковь")
    println("Текущий список ингридиентов:")
    ingredients.forEach { println(it) }
    println("Какой ингридиент хотите изменить?")
    var oldArray = readln()

    if (ingredients.any { it.equals(oldArray, ignoreCase = true) }) {
        println("Введите новый ингридиент:")
        val newIngridient = readln()

        val index = ingredients.indexOfFirst { it.equals(oldArray, ignoreCase = true) }
        if (index != -1) {
            ingredients[index] = newIngridient

            println("Готово, вы сохранили следующий список:")
            ingredients.forEach { println(it) }
        } else {
            println("Такого ингридиента в списке нет.")
        }
    }


}