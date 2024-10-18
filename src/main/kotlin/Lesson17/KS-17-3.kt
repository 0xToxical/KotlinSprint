class Folder(private val folderName: String, private val numberOfFiles: Int, private val isSecret: Boolean) {
    fun getName(): String {
        return if (isSecret) "Скрытая папка" else folderName
    }

    fun getFiles(): Int {
        return if (isSecret) 0 else numberOfFiles
    }
}

fun main() {
    val secretFolder = Folder("Документы", 10, true)
    println("Имя папки: ${secretFolder.getName()}")
    println("Количество файлов: ${secretFolder.getFiles()}")

    val publicFolder = Folder("Фотки", 15, false)
    println("Имя папки: ${publicFolder.getName()}")
    println("Количество файлов: ${publicFolder.getFiles()}")
}
