package syntax.control_flow

/*
 * Циклы While и Do..While в Kotlin
 */

fun main() {
    // Цикл while: пока количество дроидов больше 0, уменьшаем их число
    var droidCount = 100
    val jediPower = 3
    while (droidCount > 0) {
        droidCount -= jediPower
    }
    println("Все дроиды уничтожены!")

    // Цикл do-while: выполняется минимум один раз
    val salary = 1000
    var jediMoney = 0
    do {
        jediMoney += salary
    } while (jediMoney == 0) // Условие не выполнится, цикл завершится после первой итерации
    println("Джедай заработал: $jediMoney кредитов")

    // Бесконечный цикл while с вводом данных и выходом через break
    var username = ""
    while (true) {
        print("Введите имя пользователя: ")
        val inputData = readln().trim() // Убираем лишние пробелы

        if (inputData.isNotEmpty()) { // Проверяем, что строка не пустая
            username = inputData
            break // Выход из цикла
        }
    }
    println("Добро пожаловать, $username!")
}