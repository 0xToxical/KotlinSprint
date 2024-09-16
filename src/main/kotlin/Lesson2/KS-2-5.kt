import kotlin.math.pow

fun main() {
    val deposit = 70000
    val interestRate = 16.7
    val years = 20
    val depositAtEnd = deposit * (1 + interestRate / 100).pow(years)

    println("через $years лет, депозит будет %.3f".format(depositAtEnd))
}