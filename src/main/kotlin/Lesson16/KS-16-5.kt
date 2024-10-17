import kotlin.random.Random
class Player(val name: String, private var health: Int, var attackPower: Int) {
    private fun die() {
        println("$name погибает.")
        health = 0
        attackPower = 0
    }

    fun takeDamage(damage: Int) {
        if (health > 0) {
            health -= damage
            println("$name получает $damage урона. Осталось здоровья: $health")
            if (health <= 0) {
                die()
            }
        } else {
            println("$name уже мертв и не может получить урон.")
        }
    }

    fun doDamage() {
        if (health > 0) {
            val damage = Random.nextInt(15, 26)
            println("$name наносит $damage урона.")
        } else {
            println("$name не может атаковать, он мертв.")
        }
    }
    fun heal(healing: Int) {
        if (health > 0) {
            health += healing
            println("$name восстанавливает $healing здоровья. Текущее здоровье: $health")
        } else {
            println("$name мертв и не может быть вылечен.")
        }
    }

    fun printStatus() {
        println("Игрок: $name, Здоровье: $health, Сила удара = $attackPower")
    }
}

fun main() {
    val player = Player("Рубака", 100, 20)

    player.printStatus()
    player.takeDamage(20)
    player.heal(20)
    player.doDamage()
    player.takeDamage(92)
    player.heal(33)
    player.takeDamage(50)
}