open class Point(val x: Int, val y: Int) {
    open fun draw() {
        println("Рисуем точку в координатах: ($x, $y)")
    }
}

class Square(x: Int, y: Int, val side: Int) : Point(x, y) {
    override fun draw() {
        println("Рисуем квадрат с верхним левым углом в ($x, $y) и стороной $side")
    }
}

class Circle(x: Int, y: Int, val radius: Int) : Point(x, y) {
    override fun draw() {
        println("Рисуем круг с центром в ($x, $y) и радиусом $radius")
    }
}

class Screen {
    fun draw(point: Point) {
        point.draw()
    }

    fun draw(x: Float, y: Float, point: Point) {
        println("Рисуем объект с координатами ($x, $y):")
        point.draw()
    }
}

fun main() {
    val screen = Screen()

    val point = Point(1, 2)
    val square = Square(3, 4, 5)
    val circle = Circle(5, 6, 7)

    screen.draw(point)
    screen.draw(square)
    screen.draw(circle)

    screen.draw(1.5f, 2.5f, square)
    screen.draw(3.5f, 4.5f, circle)
}
