const val HOURS_IN_DAY = 24
const val MINUTES_IN_HOUR = 60

fun main() {
    val departHour = 9
    val departMin = 39
    val roadTime = 457
    val totalDepartMin = departHour * MINUTES_IN_HOUR + departMin
    val totalArrivalMin = totalDepartMin + roadTime
    val arrivalHour = (totalArrivalMin / MINUTES_IN_HOUR) % HOURS_IN_DAY
    val arrivalMin = totalArrivalMin % MINUTES_IN_HOUR

    println("Прибытие поезда в %02d:%02d".format(arrivalHour, arrivalMin))
}
