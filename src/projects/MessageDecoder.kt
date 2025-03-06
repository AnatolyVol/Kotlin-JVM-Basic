package projects

private fun main() {
    val encryptButton = 1
    val decryptButton = 2
    val exitButton = 3

    var isFirstStart = true

    while (true) {
        printMainMenu(isFirstStart)
        val selectedItemMenu = readItemMenu()
        when (selectedItemMenu) {
            encryptButton -> {
                encryptMessage()
            }

            decryptButton -> {
                decryptMessage()
            }

            exitButton -> {
                System.exit(0)
            }
        }

        isFirstStart = false
    }
}

private fun printMainMenu(isFirstStart: Boolean) {
    if (!isFirstStart)
        println()

    println(
        """
        1. Зашифровать сообщение
        2. Расшифровать сообщение
        3. Выйти из программы"""
    )
}

private fun readItemMenu(): Int {
    do {
        println("Выберите пункт:")
        val choice: Int
        try {
            choice = readln().toInt()

            when (choice) {
                1, 2, 3 -> return choice
                else -> println("Некорректный номер пункта меню")
            }
        } catch (ex: NumberFormatException) {
            println("Некорректный номер пункта меню")
        }
    } while (true)
}

fun encryptMessage() {
    val key = readln().toInt()
    val message = readln()

    var encryptedMessage = ""

    for (i in message.indices) {
        val char = message[i]
        val newChar = (char.toInt() + key).toChar()
        encryptedMessage += newChar
    }

    println(encryptedMessage)
}

fun decryptMessage() {
    val key = readln().toInt()
    val message = readln()

    var decryptedMessage = ""

    for (i in message.indices) {
        val char = message[i]
        val newChar = (char.toInt() - key).toChar()
        decryptedMessage += newChar
    }

    println(decryptedMessage)
}