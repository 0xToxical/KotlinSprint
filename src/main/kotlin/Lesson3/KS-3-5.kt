fun main() {
    val movesData = "D2-D4;0"

    val parts = movesData.split("-", ";")

    val from = parts[0]
    val to = parts[1]
    val countOfMove = parts[2]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $countOfMove")
}