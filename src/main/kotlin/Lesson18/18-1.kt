class Order {
    fun printOrder(item: String) {
        println("Заказан товар: $item")
    }

    fun printOrder(items: List<String>) {
        val joinedItems = items.joinToString(", ")
        println("Заказаны следующие товары: $joinedItems")
    }
}

fun main() {
    val order1 = Order()
    val order2 = Order()

    order1.printOrder("Ноутбук")

    order2.printOrder(listOf("Мышь", "Клавиатура", "Монитор"))
}
