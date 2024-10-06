class Participant(
    val avatar:  String ,
    val nickname: String,
    var status: String,
){
    fun showAvatar() {
        println("[Аватар: $avatar]")
    }

    fun longPress() {
        println("Никнейм: $nickname, Статус: $status")
    }
}

class Room(
    val name: String,
    val cover: String,
    val participants: MutableList<Participant> = mutableListOf(),
) {
    fun addParticipant(participant: Participant) {
        participants.add(participant)
        println("Участник ${participant.nickname} добавлен в комнату $name")
    }

    fun updateStatus(nickname: String, newStatus: String) {
        val participant = participants.find { it.nickname == nickname }
        if (participant != null) {
            participant.status = newStatus
            println("Статус участника $nickname обновлен на $newStatus")
        }else {
                println("Участник с ником $nickname не найден")
            }
        }

    fun printRoomInfo() {
        println("Комната $name")
        println("Обложка $cover")
        println("Участники:")
        for (participant in participants) {
            println("- ${participant.nickname}: ${participant.status}")

        }
    }
}

fun main() {
    val room = Room(cover = "cover.jpg", name = "Kotlin students")
    val participant1 = Participant("avatar = avatar1.jpg", nickname = "Andrew", status = "Говорит", )
    val participant2 = Participant("avatar = avatar2.jpg", nickname = "Anna", status = "Пользователь заглушен")
}