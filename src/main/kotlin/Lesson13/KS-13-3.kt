class ContactOnDirectoryList(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contacts = listOf(
        ContactOnDirectoryList("Андрей Андреев", 1234567890),
        ContactOnDirectoryList("Александр Александров", 2345678901, "KotlinCompany"),
        ContactOnDirectoryList("Иван Иванов", 3456789012),
        ContactOnDirectoryList("Петр Петров", 4567890123, "null"),
        ContactOnDirectoryList("Сергей Сергеев", 5678901234, "TechCompany")
    )

    val companies = contacts.mapNotNull { it.company }.filter { it != "null" }
    println("Список компаний в телефонной книге: $companies")
}
