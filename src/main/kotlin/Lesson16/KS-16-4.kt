class Order(private val orderNumber: Int) {
    private var status: String = "Готов к выдаче"

    private fun changeStatus(newStatus: String) {
        status = newStatus
        println("Статус заказа $orderNumber изменен на: $status")
    }

    fun sendRequest(newStatus: String) {
        println("Менеджер получил заявку на изменение статуса заказа $orderNumber")
        changeStatus(newStatus)
    }
}

fun main() {
    val order = Order(123456)
    order.sendRequest("Заказ выдан")
}