class WeatherDayInKelvin(
    dayTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    val precipitation: Boolean,
) {
    val dayTemperature: Int = dayTemperatureKelvin - 273
    val nightTemperature: Int = nightTemperatureKelvin - 273

    fun displayWeather() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (precipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weatherToday = WeatherDayInKelvin(293, 283, true)

    weatherToday.displayWeather()
}
