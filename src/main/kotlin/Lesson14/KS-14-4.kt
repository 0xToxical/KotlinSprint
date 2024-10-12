open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val suitableForLanding: Boolean,
)
class Planet(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean,
    val moons: List<Moon>,
) : CelestialBody(name, hasAtmosphere, suitableForLanding) {
    fun printPlanetInfo() {
        println("Планета $name")
        if (moons.isNotEmpty()) {
            println("Спутники:")
            moons.forEach() { println(" - ${it.name}") }
        } else {
            println("У этой планеты нет спутников")
        }
    }
}

class Moon(name: String, hasAtmosphere: Boolean, suitableForLanding: Boolean) :
    CelestialBody(name, hasAtmosphere, suitableForLanding)

fun main() {
    val moon1 = Moon("Деймос", false, false)
    val moon2 = Moon("Фобос", false, false)

    val planet = Planet("Марс", hasAtmosphere = true, suitableForLanding = true, moons = listOf(moon1, moon2))
    planet.printPlanetInfo()
}