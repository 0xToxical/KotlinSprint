fun main() {
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    val surnameBeforeMarriage = "Андреева"
    val surnameAfterMarriage = "Сидорова"
    val ageAtMarriage = 22
    val ageAt20 = 20

    val dataAt20 = """
        $name
        $surnameBeforeMarriage
        $patronymic     
        $ageAt20
    """.trimIndent()

    val dataAt22 = """
        $name
        $surnameAfterMarriage        
        $patronymic
        $ageAtMarriage
    """.trimIndent()

    println(dataAt20)

    println(dataAt22)
}