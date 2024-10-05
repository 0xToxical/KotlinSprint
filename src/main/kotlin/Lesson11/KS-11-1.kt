class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {
}
fun main() {

    val user1: User = User(

    id = 1,
    login = "Andrew",
    password = "qwerty1",
    mail = "Andrewtest@gmail.com",
    )

    val user2: User = User(
        id = 2,
        login = "Anna",
        password = "asdfgh1",
        mail = "AnnaTest@gmail.com"
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)
}

