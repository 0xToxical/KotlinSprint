fun main() {

    val omletOnePortion = listOf<Int>(2, 50, 15)
    println("Сколько порций хотите приготовить?")
    val numberOfPortion = readln().toInt()

    val eggs = omletOnePortion[0] * numberOfPortion
    val milk = omletOnePortion[1] * numberOfPortion
    val butter = omletOnePortion[2] * numberOfPortion

    println("На $numberOfPortion порций, понадобится: яиц - $eggs, молока - $milk, масла - $butter")
}