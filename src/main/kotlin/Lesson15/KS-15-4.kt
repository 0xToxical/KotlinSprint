interface Searchable {
    fun searchForParts()
}
abstract class Product(val name: String, val quantity: Int) {
    fun getInfo() {
        println("Товар: $name, количество на складе $quantity.")
    }
}

class Instrument(name: String, quantity: Int) : Product(name,quantity), Searchable {
    override fun searchForParts() {
        println("Выполняется поиск комплектующих для: $name.")
    }
}

class parts(name: String, quantity: Int) : Product(name,quantity)

fun main() {
    val guitar = Instrument("Гитара",5)
    val strings= parts("Струны для гитары",50)

    guitar.getInfo()
    guitar.searchForParts()

    strings.getInfo()
}