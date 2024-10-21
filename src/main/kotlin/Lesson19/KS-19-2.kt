enum class Category {
    CLOTHING {
        override fun getCategoryName() = "Одежда"
    },
    STATIONERY {
        override fun getCategoryName() = "Канцелярия"
    },
    MISC {
        override fun getCategoryName() = "Разное"
    };

    abstract fun getCategoryName(): String
}

class Product(val name: String, val id: Int, val category: Category) {
    fun printInfo() {
        println("Товар: $name, ID: $id, Категория: ${category.getCategoryName()}")
    }
}

fun main() {
    val product1 = Product("Футболка", 101, Category.CLOTHING)
    val product2 = Product("Ручка", 102, Category.STATIONERY)
    val product3 = Product("Тарелка", 103, Category.MISC)

    product1.printInfo()
    product2.printInfo()
    product3.printInfo()
}
