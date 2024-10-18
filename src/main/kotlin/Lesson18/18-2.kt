import kotlin.random.Random

open class Dice(val sides: Int) {
    open fun roll(): Int {
        return Random.nextInt(1, sides + 1)
    }
}

class Dice4 : Dice(4) {
    override fun roll(): Int {
        val result = super.roll()
        println("Бросок кости с 4мя гранями: $result")
        return result
    }
}

class Dice6 : Dice(6) {
    override fun roll(): Int {
        val result: Int = super.roll()
        println("Бросок кости с 6ю гранями: $result")
        return result
    }
}

class Dice8 : Dice(8) {
    override fun roll(): Int {
        val result = super.roll()
        println("Бросок 8-гранной кости: $result")
        return result
    }
}

fun main() {
    val diceList: List<Dice> = listOf(
        Dice4(),
        Dice6(),
        Dice8()
    )

    for (dice in diceList) {
        dice.roll()
    }
}