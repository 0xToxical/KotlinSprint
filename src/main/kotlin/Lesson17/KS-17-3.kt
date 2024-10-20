class Folder(folderName: String, numberOfFiles: Int, private val isSecret: Boolean) {
    var folderName: String = folderName
        get() = if (isSecret) "Скрытая папка" else field

    var numberOfFiles: Int = numberOfFiles
        get() = if (isSecret) 0 else field
}

fun main() {
    val secretFolder = Folder("Документы", 10, true)
    println("Имя папки: ${secretFolder.folderName}")
    println("Количество файлов: ${secretFolder.numberOfFiles}")

    val publicFolder = Folder("Фотки", 15, false)
    println("Имя папки: ${publicFolder.folderName}")
    println("Количество файлов: ${publicFolder.numberOfFiles}")
}
