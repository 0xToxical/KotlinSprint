fun main() {

    println("Введите число:")
    val usedNumber = readln().toInt()
    val intProgression = 0..usedNumber step 2

    for (i in intProgression)
        println(i)
}