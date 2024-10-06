class Forum {
    private val members = mutableMapOf<Int, String>()
    private val messages = mutableListOf<ForumMessage>()
    private var nextUserId = 1

   fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(nextUserId, userName)
        members[nextUserId] = userName
        nextUserId += 1
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        val authorName = members[authorId]
        return if (authorName != null) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
            newMessage
        } else {
            null
        }
    }

    fun printThread() {
        messages.forEach { message ->
            val authorName = members[message.authorId]
            println("$authorName: ${message.message}")
        }
    }
}

data class ForumMember(val userId: Int, val userName: String)
data class ForumMessage(val authorId: Int, val message: String)

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("User1")
    val user2 = forum.createNewUser("User2")

    forum.createNewMessage(user1.userId, "Hello from User1!")
    forum.createNewMessage(user1.userId, "Another message from User1.")
    forum.createNewMessage(user2.userId, "Hello from User2!")
    forum.createNewMessage(user2.userId, "Another message from User2.")

    forum.printThread()
}
