const val sunnyToday: Boolean = true
const val awningNow: Boolean = true
const val airHumidity: Int = 20
const val partOfYear: String = "winter"

fun main() {

    val conditionForBeans = sunnyToday && awningNow && airHumidity == 20 && partOfYear != "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionForBeans")


}