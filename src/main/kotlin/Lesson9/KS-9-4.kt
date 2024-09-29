fun main() {

    println("Введите пять ингредиентов, разделенных запятой с пробелом:")
    val usersIngredient = readln()
    val ingredientList = usersIngredient.split(", ")
    val sortedIngredientList = ingredientList.sorted()

    println("Отсортированные ингредиенты $sortedIngredientList")
}