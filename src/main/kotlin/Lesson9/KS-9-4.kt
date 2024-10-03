fun main() {
    println("Введите пять ингредиентов, разделенных запятой с пробелом:")
    val sortedIngredientList = readln().split(", ").sorted()
    println("Отсортированные ингредиенты: $sortedIngredientList")
}