class ContactOnDirectoryV2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}
fun main() {
    val contacts = mutableListOf<ContactOnDirectoryV2>()

    print("Введите имя контакта: ")
    val name = readln()
    print("Введите номер телефона: ")
    val inputPhoneNumber = readln()

    try {
        val phoneNumber = inputPhoneNumber.toLong()
        val contact = ContactOnDirectoryV2(name, phoneNumber)

        contacts.add(contact)
        contact.printContactInfo()
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e.message}")
    }
}
