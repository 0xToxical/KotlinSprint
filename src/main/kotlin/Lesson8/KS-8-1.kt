fun main() {

    var views = IntArray(7)

    for (i in views.indices) {
        println("Введите количество просмотров за день ${i + 1}:")
        views[i] = readln().toInt()
    }

    var totalViews = 0
    for (i in views.indices) {
        totalViews += views[i]
    }
println("Общее количество просмотров за неделю: $totalViews")}
