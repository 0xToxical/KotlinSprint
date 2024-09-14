fun main() {
    val crystalOre = 7
    val ironOre = 11
    val percentOfBuff = 20

    val bonusCrystal = (crystalOre * percentOfBuff) / 100
    val bonusIron = (ironOre * percentOfBuff) / 100

    println("Бонусная кристальная руда : $bonusCrystal")
    println("Бонусная железная руда : $bonusIron")
}