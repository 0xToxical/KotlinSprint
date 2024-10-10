class ContactOnDirectoryInput(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contacts = mutableListOf<ContactOnDirectoryInput>()

    val inputData = listOf(
        Triple("Андрей Андреев", "1234567890", null),
        Triple("Александр Александров", "", "KotlinCompany"),
        Triple("Мария Петрова", "2345678901", null),
        Triple("Светлана Иванова", "3456789012", "TechCorp"),
        Triple("Дмитрий Сидоров", "", "null")
    )

    for (data in inputData) {
        val name = data.first
        val phoneNumber = data.second.toLongOrNull()

        if (phoneNumber == null) {
            println("Контакт '$name' не добавлен: нет номена телефона.")
            continue
        }

        val company = if (data.third.isNullOrEmpty()) null else data.third
        val contact = ContactOnDirectoryInput(name, phoneNumber, company)
        contacts.add(contact)
    }

    println("\nСписок контактов:")
    for (contact in contacts) {
        contact.printContactInfo()
    }
}
