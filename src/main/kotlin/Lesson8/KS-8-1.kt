fun main() {
    val views = IntArray(7)

    for (i in views.indices) {
        println("Введите количество просмотров за день ${i + 1}:")
        views[i] = readln().toInt()
    }

    val totalViews = views.sum()

    println("Общее количество просмотров за неделю: $totalViews")
}
