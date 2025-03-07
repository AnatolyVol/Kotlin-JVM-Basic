package projects

private fun main() {
    val newGameButton = 1
    val settingsButton = 2
    val exitButton = 3

    var isFirstStart = true

    while (true) {
        printMainMenu(isFirstStart)
        val selectedItemMenu = readItemMenu()
        when (selectedItemMenu) {
            newGameButton -> {
                runNewGame()
            }

            settingsButton -> {
                showSettingsManager()
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
            1. Начать новую игру
            2. Настройки
            3. Выйти из игры
            """
    )
}

private fun readItemMenu(): Int {
    while (true) {
        println("Выберите пункт:")
        when (val userChoice = readln()) {
            "1", "2", "3" -> return userChoice.toInt()
            else -> {
                println("Некорректный номер пункта меню")
            }
        }
    }
}

private fun runNewGame() {
    val citiesList = arrayOf(
        "москва",
        "санкт-петербург",
        "иннополис",
        "сочи",
        "новосибирск",
        "екатеринбург",
        "казань",
        "волгоград",
        "красноярск",
        "астрахань",
        "оренбург",
        "томск",
        "рязань"
    )

    val namedCityList = Array(citiesList.size) { "" }
    var namedCityNumber = 0

    println()
    println("Начнем игру! Назовите город:")

    while (true) {
        val playerCity = readln()

        if (playerCity == "не знаю") {
            println("Победил ИИ!")
            println("Игра окончена. Спасибо за участие!")
            break
        }

        var isFoundCity = false
        for (city in citiesList) {
            if (playerCity == city) {
                isFoundCity = true
                break
            }
        }
        if (!isFoundCity) {
            println("Город \"$playerCity\" не найден. Не знаете больше городов? (Введите \"не знаю\")")
            continue
        }
        var isAlreadyNamedCity = false
        for (city in namedCityList) {
            if (playerCity == city) {
                isAlreadyNamedCity = true
                break
            }
        }
        if (isAlreadyNamedCity) {
            println("Город \"$playerCity\" уже был назван. Не знаете больше городов? (Введите \"Не знаю\")")
            continue
        }

        namedCityList[namedCityNumber] = playerCity
        namedCityNumber++

        val lastChar = playerCity[playerCity.lastIndex]
        val isSpecialChar = lastChar in arrayOf('ь', 'ъ', 'ы', 'й')

        val firstSymbolOfNewCity = if (isSpecialChar && playerCity.length > 1) {
            playerCity[playerCity.length - 2]
        } else {
            lastChar
        }
        var foundCity = false

        for (city in citiesList) {
            var isAlreadyNamed = false
            for (namedCity in namedCityList) {
                if (city == namedCity) {
                    isAlreadyNamed = true
                    break
                }
            }

            if (isAlreadyNamed)
                continue

            if (city[0] == firstSymbolOfNewCity) {
                println(city)
                foundCity = true
                namedCityList[namedCityNumber] = city
                namedCityNumber++
                break
            }
        }

        if (!foundCity) {
            println("Жаль, я не знаю ни одного города на букву '$firstSymbolOfNewCity'.")
            println("Победил игрок!")
            break
        }
    }
}

private fun showSettingsManager() {
    // TODO Добавить что-то позже
}