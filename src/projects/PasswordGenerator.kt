package projects

private fun main() {
    val passwordLengthButton = 1
    val symbolTypesButton = 2
    val generatePasswordButton = 3
    val exitButton = 4

    var passwordLength = 10
    var symbolTypes = "Все"
    var isFirstStart = true

    while (true) {
        printMainMenu(isFirstStart)
        val selectedItemMenu = readItemMenu()
        when (selectedItemMenu) {
            passwordLengthButton -> {
                passwordLength = readPasswordLength()
            }

            symbolTypesButton -> {
                symbolTypes = readSymbolTypes()
            }

            generatePasswordButton -> {
                val password = generatePassword(passwordLength, symbolTypes)
                println("Сгенерированный пароль: $password")
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
        1. Задать количество символов
        2. Задать типы символов
        3. Сгенерировать пароль
        4. Выйти из программы
    """.trimIndent() + "\n"
    )
}

private fun readItemMenu(): Int {
    println("Выберите пункт:")
    val menu = readln().toInt()
    return menu
}

private fun readPasswordLength(): Int {
    println("Введите длину пароля:")
    var passwordLength = readln().toInt()
    return passwordLength
}

private fun readSymbolTypes(): String {
    println("Введите типы символов:")
    var symbolTypes = readln()
    return symbolTypes
}

private fun generatePassword(passwordLength: Int, symbolTypes: String): String {
    val uppercaseSymbols = arrayOf(
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    )
    val lowercaseSymbols = arrayOf(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    )
    val specialSymbols = arrayOf('!', '@', '#', '$', '%', '&', '*', '+', '-')
    val digits = arrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')

    var password = Array<Char>(passwordLength) { ' ' }

    var privateKey = 1234567890
    var privateKey2 = 1234567890

    for (i in password.indices) {
        var type = privateKey2 % 4
        var symbols: Array<Char> = when (type) {
            0 -> uppercaseSymbols
            1 -> lowercaseSymbols
            2 -> specialSymbols
            3 -> digits
            else -> emptyArray()
        }
        var symbolIndex = privateKey % symbols.size
        password[i] = symbols[symbolIndex]
        privateKey /= i + 1
        privateKey2 /= i + 1
    }
    var passwordResult = ""
    for (i in password.indices) {
        passwordResult += password[i]
    }
    return passwordResult
}

private fun exitProgram() {
    println("Ожидается выход из программы")

}