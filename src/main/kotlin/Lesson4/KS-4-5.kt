fun main() {
    var shipIsDamaged: Boolean = false
    var crewOnShip = 60
    var provisions = 51
    var weatherGood: Boolean = true

    val shipCanSailAway =
        (!shipIsDamaged && crewOnShip in 55..70 && provisions >= 51) || (shipIsDamaged && crewOnShip == 70 && weatherGood && provisions >= 50)

    println("Корабль может отправиться в плавание? $shipCanSailAway")

}