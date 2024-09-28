fun main() {
    var smsCode = (1000 until 10000).random()
    println("Ваш код авторизации: ${smsCode}")
    var authorized = false

    do {
        println("Введите код из смс")
        var answer = readln().toInt()
        if (answer == smsCode) {
            authorized = true
            println("Добро пожаловать!")
        } else {
            println("Неверный код. Высылаю новый код...")
            smsCode = (1000 until 10000).random()
            println("Ваш новый код авторизации: $smsCode")
        }
    } while (!authorized)
}