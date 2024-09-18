fun main() {
   println("Введите первое число от 0 до 42")
    val firstInput = readln(). toInt()
    println("Введите второе число от 0 до 42")
    val secondInput = readln(). toInt()

    val result1 = (firstInput ==firstNumber || firstInput == secondNumber)
    val result2 = (secondInput == firstNumber || secondInput == secondNumber)

 println("Правильные числа были $firstNumber и $secondNumber")
    when {
        result1 && result2 ->println("Поздравляем! Вы выиграли главный приз!")
        result1 || result2 ->println("Вы выиграли утешительный приз!")
        else ->println("Неудача!")
    }
}
const val firstNumber = 25
const val secondNumber = 28