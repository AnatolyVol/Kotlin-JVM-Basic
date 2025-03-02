package projects

fun main() {
    val game = 1
    val guide = 2
    val exit = 3
    var isFirstStart = true

    while (true) {
        printMainMenu(isFirstStart)
        val selectedItemMenu = readItemMenu()
        when (selectedItemMenu) {
            game -> runGame()
            guide -> showGuide()
            exit -> System.exit(0)
        }
        isFirstStart = false
    }
}

fun printMainMenu(isFirstStart: Boolean) {
    if (!isFirstStart)
        println()
    println(
        """
        1. Запустить игру
        2. Гид по игре
        3. Выйти из игры
    """.trimIndent() + "\n"
    )
}

fun readItemMenu(): Int {
    val menuItems = arrayOf("1", "2", "3")

    while (true) {
        println("Выберите пункт:")
        val stepNumber = readln()
        if (stepNumber !in menuItems) {
            println("Некорректный номер пункта меню")
        } else {
            return stepNumber.toInt()
        }
    }
}

fun runGame() {
    println("Идет запуск игры\n")

    val minRangeNumber = 0
    val maxRangeNumber = 100
    val correctNumber = (minRangeNumber..maxRangeNumber).random()
    var count = 0

    while (true) {
        println("Введите число:")
        val number = readln().toInt()

        when {
            number !in minRangeNumber..maxRangeNumber -> println("Число $number лежит за пределами заданного промежутка")
            number == correctNumber -> {
                count++
                println(
                    """
                    Вы угадали число!
                    Кол-во попыток: $count
                """.trimIndent()
                )
                break
            }

            number < correctNumber -> {
                count++
                println("Загаданное число больше")
            }

            number > correctNumber -> {
                count++
                println("Загаданное число меньше")
            }
        }
    }
}

fun showGuide() {
    println("Открывается гид по игре\n")
    val questionOne = """
        Вопрос: Какая цель игры?
        Ответ: Целью игры является отгадывание числа, придуманного ИИ "Алиса", за минимальное число попыток.
    """.trimIndent()
    val questionTwo = """
        Вопрос: Сколько дается попыток?
        Ответ: Количество попыток вычисляет Алиса по собственной формуле, и она отказывается раскрывать ее.
    """.trimIndent()
    val questionThree = """
        Вопрос: Есть ограничение по времени?
        Ответ: Алиса очень терпеливая, она будет ждать вашего ответа до тех пор, пока ее Создатель не забудет оплатить счет за аренду сервера.
    """.trimIndent()

    println("$questionOne\n\n$questionTwo\n\n$questionThree")
}