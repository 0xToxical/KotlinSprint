import kotlin.random.Random

fun main() {
//    println("Для регистрации, введите логин")
//    val regLogin = readln()
//    println("Введите пароль")
//    val regPassword = readln()
//
//    println("Вы успешно зарегистрировались!")
//
//    var login: String
//    var password: String

    var attemps = 3

    val rndmNumber1 = Random.nextInt(1, 10)
    val rndmNumber2 = Random.nextInt(1, 10)
    val trueAnswer = rndmNumber1 + rndmNumber2

    (println("Докажите, что Вы не бот, решите задачку:$rndmNumber1 + $rndmNumber2 = ?"))


    while (attemps > 0) {
        val answer = readln().toInt()
        if (answer == trueAnswer) {
            println("Добро пожаловать!")
            break
        } else {
            attemps--
            println("Неверно, осталось попыток $attemps")
            if (attemps > 0) {
                println("Попробуйте еще раз: $rndmNumber1 + $rndmNumber2 = ?")
            }
        }
        if (attemps == 0) {
            println("Доступ запрещен")

//            do {
//                println("Введите логин")
//                login = readln()
//                println("Введите пароль")
//                password = readln()
//
//                if (login != regLogin || password != regPassword) {
//                    println("Неправильный логин или пароль, попробуйте еще раз")
//                }
//            } while (login != regLogin || password != regPassword)
//
//            println("Успешная авторизация")
        }
    }
}
