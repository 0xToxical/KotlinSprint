import kotlin.random.Random

class Dice{
    private val numerRolled: Int = Random.nextInt(1,7)

    fun getRolledNumber() {
        println("На кубике выпало число $numerRolled")
    }
}

fun main() {
    val dice = Dice()
    dice.getRolledNumber()
}