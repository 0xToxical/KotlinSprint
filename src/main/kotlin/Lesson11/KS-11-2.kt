class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = ""
) {

    fun printInfo() {
        println("ID: $id")
        println("Login: $login")
        println("Mail: $mail")
        println("Bio: $bio")
    }

    fun setBio() {
        println("Введите информацюи о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val curretPassword = readln()
        if (curretPassword == password) {
            println("Введите новый пароль:")
            val newPassword = readln()
            password = newPassword
            println("Пароль успешно изменен.")
        }
    }
}


fun main() {
    val newUser = User2(
        id = 1,
        login = "login2",
        password = "qwerty",
        mail = "test@gmail.com",
    )

    newUser.printInfo()
    newUser.setBio()
    newUser.changePassword()
    newUser.printInfo()

}