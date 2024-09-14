fun main() {
    val departHour = 9
    val departMin = 39
    val roadTime = 457
    val totalDepartMin = departHour * 60 + departMin
    val totalArrivalMin = totalDepartMin + roadTime
    val arrivalHour = (totalArrivalMin / 60) % 24
    val arrivalMin = totalArrivalMin % 60

    println("Прибытие поезда в ${String.format("%02d", arrivalHour)}:${String.format("%02d", arrivalMin)}")
}
