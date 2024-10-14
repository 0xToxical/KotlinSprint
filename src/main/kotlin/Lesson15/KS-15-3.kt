abstract class ForumUser(val username: String) {
    fun readForum() {
        println("$username читает форум.")
    }

    abstract fun writeMessage(message: String)
}

class User(username: String) : ForumUser(username) {
    override fun writeMessage(message: String) {
        println("$username пишет сообщение: \"$message\"")
    }
}

class Admin(username: String) : ForumUser(username) {
    override fun writeMessage(message: String) {
        println("$username пишет сообщение: \"$message\"")
    }

    fun deleteMessage(message: String) {
        println("$username удаляет сообщение: \"$message\"")
    }

    fun deleteUser(user: ForumUser) {
        println("$username удаляет пользователя: ${user.username}")
    }
}

fun main() {
    val user1 = User("Обычный пользователь")
    val admin = Admin("Администратор форума")

    user1.readForum()
    user1.writeMessage("Всем привет!")

    admin.readForum()
    admin.writeMessage("Пожалуйста, соблюдайте правила форума.")
    admin.deleteMessage("Сообщение с нарушением")
    admin.deleteUser(user1)
}