interface Swimmable {
    fun swim()
}

interface Flyable {
    fun fly()
}

class Karas : Swimmable {
    override fun swim() {
        println("Карась плавает в воде.")
    }
}

class Seagull : Flyable, Swimmable {
    override fun fly() {
        println("Чайка летает в небе.")
    }

    override fun swim() {
        println("Чайка плавает на поверхности воды.")
    }
}

class Duck : Flyable, Swimmable {
    override fun fly() {
        println("Утка летает в небе.")
    }

    override fun swim() {
        println("Утка плавает в воде.")
    }
}

fun main() {
    val karas = Karas()
    val seagull = Seagull()
    val duck = Duck()

    karas.swim()
    seagull.fly()
    seagull.swim()
    duck.fly()
    duck.swim()
}