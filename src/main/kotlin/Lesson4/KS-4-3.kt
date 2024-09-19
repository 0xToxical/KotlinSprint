const val goodSunny: Boolean = true
const val goodAwning: Boolean = true
const val goodAirHumidity: Int = 20
const val badPartOfYear: String = "winter"

fun main() {
    val sunnyNow: Boolean = true
    val awningNow: Boolean = true
    val airHumidityNow: Int = 20
    val partOfYearNow: String = "winter"

    val goodConditionForBeans = (sunnyNow == goodSunny) && (awningNow == goodAwning) && (airHumidityNow == goodAirHumidity) && (partOfYearNow != badPartOfYear)

    println("Благоприятные ли условия сейчас для роста бобовых? $goodConditionForBeans")


}