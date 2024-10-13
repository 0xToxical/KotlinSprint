class User(private val user: String,private val password: String) {
    fun validatePassword(inputPassword: String): Boolean {
        return password == inputPassword
    }
}

fun main() {
    val user = User("TestUser", "TestPassword")

    val inputPassword = "TestPassword"
    if (user.validatePassword(inputPassword)) {
        println("Пароль верный.")
    }else{
        println("Парль неверный.")
    }
}