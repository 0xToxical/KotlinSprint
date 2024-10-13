open class Message(
    val id: Int,
    val text: String,
    val author: String
)

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    val parentMessageId: Int
) : Message(id, text, author)

class Chat {
    private val messages = mutableListOf<Message>()
    private var messageCounter = 0

    fun addMessage(text: String, author: String) {
        val message = Message(++messageCounter, text, author)
        messages.add(message)
    }

    fun addThreadMessage(parentMessageId: Int, text: String, author: String) {
        val threadMessage = ChildMessage(++messageCounter, text, author, parentMessageId)
        messages.add(threadMessage)
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { message ->
            when (message) {
                is ChildMessage -> message.parentMessageId
                else -> message.id
            }
        }

        groupedMessages.forEach { (parentId, messageGroup) ->
            messageGroup.forEach { message ->
                if (message is ChildMessage) {
                    println("\t[Ответ на сообщение $parentId]: ${message.text} (Автор: ${message.author})")
                } else {
                    println("[Сообщение ${message.id}]: ${message.text} (Автор: ${message.author})")
                }
            }
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("Привет всем!", "Андрей")
    chat.addMessage("Как дела?", "Сергей")
    chat.addThreadMessage(1, "Привет, Андрей!", "Иван")
    chat.addThreadMessage(2, "Все хорошо, спасибо!", "Петр")

    chat.printChat()
}
