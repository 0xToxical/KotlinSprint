const val SECONDS_IN_MINUTE = 60

fun main() {
    val secondsInSpace: Short = 6480

    val minutesInSpace = secondsInSpace / SECONDS_IN_MINUTE
    val seconds = secondsInSpace % SECONDS_IN_MINUTE
    val hours = minutesInSpace / SECONDS_IN_MINUTE
    val minutes = minutesInSpace % SECONDS_IN_MINUTE
    val timeInSpace = String.format("%02d:%02d:%02d", hours, minutes,seconds)
    println(timeInSpace)
}

