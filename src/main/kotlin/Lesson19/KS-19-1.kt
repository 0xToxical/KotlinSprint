enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}

fun main() {
    println("Доступные рыбы для аквариума:")

    for (fish in Fish.entries) {
        println(fish.name.lowercase().replace("_", " ").replaceFirstChar { it.uppercase() })
    }
}
