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

    print("Выберите пункт: ")

    val stepNumber = readln().toInt()

    when (stepNumber) {
        1 -> playGame()
        2 -> settingsGame()
        3 -> exitGame()
        else -> println("Некорректный ввод.")
    }
}

fun playGame() {
    println("Идет запуск игры")
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

fun settingsGame() {
    println("Открывается гид по игре")

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

fun exitGame() {
    println("Идет закрытие игры")
}