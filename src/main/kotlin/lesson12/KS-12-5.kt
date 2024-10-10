import kotlin.random.Random

class WeatherDayInKelvin(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, precipitation: Boolean) {

    val dayTemperature: Int
    val nightTemperature: Int
    val precipitation: Boolean

    init {
        this.dayTemperature = dayTemperatureKelvin - 273
        this.nightTemperature = nightTemperatureKelvin - 273
        this.precipitation = precipitation
    }
}

fun List<Int>.averageTemperature(): Double {
    return this.average()
}

fun main() {
    val weatherList = mutableListOf<WeatherDayInKelvin>()
    val dayTemperatures = mutableListOf<Int>()
    val nightTemperatures = mutableListOf<Int>()
    val precipitationDays = mutableListOf<Boolean>()

    for (i in 1..30) {
        val dayTempKelvin = Random.nextInt(293, 308)
        val nightTempKelvin = Random.nextInt(273, 293)
        val precipitation = Random.nextBoolean()

        val weatherDay = WeatherDayInKelvin(dayTempKelvin, nightTempKelvin, precipitation)

        weatherList.add(weatherDay)
        dayTemperatures.add(weatherDay.dayTemperature)
        nightTemperatures.add(weatherDay.nightTemperature)
        precipitationDays.add(weatherDay.precipitation)
    }

    val averageDayTemperature = dayTemperatures.averageTemperature()
    val averageNightTemperature = nightTemperatures.averageTemperature()
    val daysWithPrecipitation = precipitationDays.count { it }

    println("Средняя дневная температура: $averageDayTemperature°C")
    println("Средняя ночная температура: $averageNightTemperature°C")
    println("Количество дней с осадками: $daysWithPrecipitation")
}
