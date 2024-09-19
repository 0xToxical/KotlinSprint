fun main() {
    val MIN_CREW = 55
    val MAX_CREW = 70
    val MIN_PROVISION_WITHOUT_DAMAGE = 50
    val MIN_PROVISION_WITH_LOW_DAMAGE = 51

    val lowDamageToShip = "low"
    val middleDamageToShip = "middle"
    val highDamageToShip = "high"
    val noDamageToShip = "none"
    val weatherIsGood = true
    val weatherIsBad = false

    val damageLevel = lowDamageToShip
    val crewOnShip = 60
    var provisions = 51
    val shipCanSailAway =
        (damageLevel == noDamageToShip && crewOnShip in MIN_CREW..MAX_CREW && provisions >= MIN_PROVISION_WITHOUT_DAMAGE)
     || (damageLevel == lowDamageToShip && crewOnShip == MAX_CREW && weatherIsGood && provisions >= MIN_PROVISION_WITH_LOW_DAMAGE)


    println("Корабль может отправиться в плавание? $shipCanSailAway")

}