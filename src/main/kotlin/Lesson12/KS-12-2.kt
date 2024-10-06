class WeatherDay(val dayTemperature: Int, val nightTemperature: Int, val precipitation: Boolean) {

    fun printWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (precipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weatherToday = WeatherDay(20, 10, false)

    weatherToday.printWeatherInfo()
}
