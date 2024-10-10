class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
)
fun main() {
    val contact1 = Contact("Андрей Андреев", 1234567890)
    val contact2 = Contact("Александр Александров", 2345678901, "KotlinCompany")

}