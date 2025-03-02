package projects

fun main() {
    startGame()
}

fun startGame() {
    val number = readln().toInt()
    when (number) {
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