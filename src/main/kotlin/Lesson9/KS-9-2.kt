fun main() {

    val listOfBaseIngredients = mutableListOf("мясо", "рис", "морковь")
    println("В рецепте есть базовые ингредиенты: $listOfBaseIngredients")
    println("Желаете добавить еще? (да/нет)")
    val userAnswer = readln()

    if (userAnswer.lowercase() == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        listOfBaseIngredients.add(newIngredient)
    } else {
      return
    }
    println("Теперь в рецепте есть следующие ингредиенты: $listOfBaseIngredients")
}
