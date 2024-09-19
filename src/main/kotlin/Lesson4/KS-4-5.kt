fun main() {
    val shipIsDamaged: Boolean = false
    val MIN_CREW = 55
    val MAX_CREW = 70
    val REQUIREMENT_CREW = 70
    val MIN_PROVISION = 50
    val GOOD_WEATHER = true

    val crewOnShip = 60
    var provisions = 51

    val shipCanSailAway =
        (!shipIsDamaged && crewOnShip in MIN_CREW..MAX_CREW && provisions >= MIN_PROVISION) || (shipIsDamaged && crewOnShip == REQUIREMENT_CREW && GOOD_WEATHER && provisions >= provisions)

    println("Корабль может отправиться в плавание? $shipCanSailAway")

}