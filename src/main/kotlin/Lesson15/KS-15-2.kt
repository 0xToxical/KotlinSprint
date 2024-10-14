abstract class WeatherStationStats {
    abstract fun getData(): String
}

class Temperature(val degreesCelsius: Double) : WeatherStationStats() {
    override fun getData(): String {
        return "Температура: $degreesCelsius C"
    }
}

class PrecipitationAmount(val millimeters: Double) : WeatherStationStats() {
    override fun getData(): String {
        return "Количество осадков $millimeters мм"
    }
}

class WeatherServer {
    fun sendData(data: WeatherStationStats) {
        when (data) {
            is Temperature -> println(" ${data.getData()}")
            is PrecipitationAmount -> println(" ${data.getData()}")
            else -> println("Неизвестные данные")
        }
    }
}

fun main() {
    val temperatureData = Temperature(4.8)
    val precipitationData = PrecipitationAmount(33.0)
    val server = WeatherServer()

    server.sendData(temperatureData)
    server.sendData(precipitationData)
}