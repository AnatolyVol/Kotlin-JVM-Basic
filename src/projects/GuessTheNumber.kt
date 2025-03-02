package projects

fun main() {
    startGame()
}

fun startGame() {
    println("""
        1. Запустить игру
        2. Гид по игре
        3. Выйти из игры
    """.trimIndent() + "\n")

    println("Выберите пункт:\n")

    val stepNumber = readln().toInt()

    when (stepNumber) {
        1 -> playGame()
        2 -> settingsGame()
        3 -> exitGame()
    }
}

fun playGame() {
    println("Идет запуск игры")
}

fun settingsGame() {
    println("Открывается гид по игре")
}

fun exitGame() {
    println("Идет закрытие игры")
}