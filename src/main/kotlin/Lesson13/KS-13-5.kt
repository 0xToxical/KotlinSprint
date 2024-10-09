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
    val name = readLine() ?: return
    print("Введите номер телефона: ")
    val inputPhoneNumber = readLine()

    try {
        val phoneNumber = inputPhoneNumber?.toLong() ?: throw NumberFormatException("Номер телефона не может быть пустым")
        val contact = ContactOnDirectoryV2(name, phoneNumber)

        contacts.add(contact)
        contact.printContactInfo()
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e.message}")
    }
}
