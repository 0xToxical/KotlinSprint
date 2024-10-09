class ContactOnDirectory(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        println("Имя $name Номер: $phoneNumber Компания ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contact1 = ContactOnDirectory("Андрей Андреев", 1234567890)
    val contact2 = ContactOnDirectory("Александр Александров", 2345678901, "KotlinCompany")

    contact1.printContactInfo()
    contact2.printContactInfo()
}