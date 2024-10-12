abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    val figures = listOf<Figure>(
        Circle("black", 6.1),
        Rectangle("white", 5.1, 7.7),
        Circle("white", 4.4),
        Rectangle("black", 3.3, 5.6)
    )

    val totalBlackPerimeter = figures
        .filter { it.color == "black" }
        .sumOf { it.calculatePerimeter() }

    val totalWhiteArea = figures
        .filter { it.color == "white" }
        .sumOf { it.calculateArea() }

    println("Сумма периметров всех черных фигур: $totalBlackPerimeter")
    println("Сумма площадей всех белых фигур: $totalWhiteArea")
}