open class Shape {
    open fun draw(x: Float, y: Float) {
        println("Рисуем фигуру в координатах ($x, $y)")
    }
}

class Point : Shape() {
    override fun draw(x: Float, y: Float) {
        println("Рисуем точку в координатах ($x, $y)")
    }
}

class Square(private val side: Float) : Shape() {
    override fun draw(x: Float, y: Float) {
        println("Рисуем квадрат с верхним левым углом в ($x, $y) и стороной $side")
    }
}

class Circle(private val radius: Float) : Shape() {
    override fun draw(x: Float, y: Float) {
        println("Рисуем круг с центром в ($x, $y) и радиусом $radius")
    }
}

class Screen {
    fun draw(x: Float, y: Float, shape: Shape) {
        shape.draw(x, y)
    }
}

fun main() {
    val screen = Screen()

    val point = Point()
    val square = Square(5.0f)
    val circle = Circle(3.0f)

    screen.draw(1.5f, 2.5f, point)
    screen.draw(3.5f, 4.5f, square)
    screen.draw(5.5f, 6.5f, circle)
}
