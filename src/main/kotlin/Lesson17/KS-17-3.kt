class Folder(private val folderName: String, private val numberOfFiles: Int, private val isSecret: Boolean) {
    val name: String
        get() = if (isSecret) "Скрытая папка" else folderName

    val files: Int
        get() = if (isSecret) 0 else numberOfFiles
}

fun main() {
    val secretFolder = Folder("Документы", 10, true)

    println("Имя папки: ${secretFolder.name}")
    println("Количество файлов: ${secretFolder.files}")


    val publicFolder = Folder("Фотки", 15, false)

    println("Имя папки: ${publicFolder.name}")
    println("Количество файлов: ${publicFolder.files}")
}