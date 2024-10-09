class weather(
    var dayTemperature: Int = 0,
    var nightTemperature: Int = 0,
    var precipitation: Boolean = false,
) {
   fun printWeatherInfo() {
       println("Дневная температура: $dayTemperature градусов")
       println("Ночная температура: $nightTemperature градусов")
       println("Были ли осадки сегодня: ${if (precipitation) "Да" else "Нет"}")
   }
}

fun main() {
    val day1 = weather()
    day1.dayTemperature = 25
    day1.nightTemperature = 13
    day1.precipitation = true

    val day2 = weather()
    day2.dayTemperature = 28
    day2.nightTemperature = 20
    day2.precipitation = false

    println("День 1:")
    day1.printWeatherInfo()

    println("День 2:")
    day2.printWeatherInfo()
}