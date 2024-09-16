fun main() {
    val constWorker = 50
    val ZP = 30000
    val newWorker = 30
    val ZPN = 20000

    val old = (constWorker * ZP)
    println(old)

    val newbie = (newWorker * ZPN)
    val salary = (old + newbie)
    println(salary)

    val workers = (constWorker + newWorker)
    println(salary / workers)
}