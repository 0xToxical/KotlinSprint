open class Box{
    open fun surfaceArea(): Double {
        return 0.0
    }
}

class RectangleBox(private val length: Double, private val width: Double, private val height: Double) : Box() {
    override fun surfaceArea(): Double {
        return 2 * (length * width + width * height + height * length)
    }
}

class CubicBox(private val edgeLenght: Double) : Box() {
    override fun surfaceArea(): Double {
        return 6 * edgeLenght * edgeLenght
    }
}

fun main() {
    val RectangleBox = RectangleBox(2.0, 3.0, 4.0)
    val CubicBox = CubicBox(2.5)

    println("Площадь поверхности прямоугольной коробки: ${RectangleBox.surfaceArea()}")
    println("Площадь поверхности кубической коробки: ${CubicBox.surfaceArea()}")
}