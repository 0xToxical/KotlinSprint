fun main() {

    val sunnyToday = true
    val awningNow = true
    val airHumidity = 20
    val partOfYear = "winter"

    val conditionForBeans = sunnyToday && awningNow && airHumidity == 20 && partOfYear != "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionForBeans")


}