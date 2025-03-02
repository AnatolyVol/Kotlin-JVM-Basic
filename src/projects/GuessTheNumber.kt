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
    println("""
        1. Запустить игру
        2. Гид по игре
        3. Выйти из игры
    """.trimIndent() + "\n")
}

fun readItemMenu(): Int {
    println("Выберите пункт:\n")
    val stepNumber = readln().toInt()

    return when (stepNumber) {
        1 -> 1
        2 -> 2
        3 -> 3
        else -> {
            println("Некорректный ввод, попробуйте снова.")
            readItemMenu()
        }
    }
}

fun runGame() {
    println("Идет запуск игры\n")
    val correctNumber = readln().toInt()

    while (true) {
        println("Введите число:")
        var number = readln().toInt()

        when {
            number !in 1..100 -> println("Число $number лежит за пределами заданного промежутка")
            number == correctNumber -> {
                println("Вы угадали число!")
                break
            }
            number < correctNumber -> println("Загаданное число больше")
            number > correctNumber -> println("Загаданное число меньше")
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