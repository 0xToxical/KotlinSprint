class WeatherDayInKelvin(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, precipitation: Boolean) {

    val dayTemperature: Int
    val nightTemperature: Int
    val precipitation: Boolean

    init {
        this.dayTemperature = dayTemperatureKelvin - 273
        this.nightTemperature = nightTemperatureKelvin - 273
        this.precipitation = precipitation

        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (precipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weatherToday = WeatherDayInKelvin(293, 283, true)
}
