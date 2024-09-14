import java.time.LocalTime
import java.time.Duration

fun main() {
    val depart = LocalTime.of(9, 7)
    val arrival = LocalTime.of(10, 55)

    val duration = Duration.between(depart, arrival)

    val hours = duration.toHours()
    val minutes = duration.toMinutes() % 60
    val seconds = duration.toSeconds() % 60
    val timeInSpace = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(timeInSpace)
}

