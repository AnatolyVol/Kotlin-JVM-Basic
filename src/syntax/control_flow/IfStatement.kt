package syntax.control_flow

/*
 * Условный оператор if в Kotlin
 */

fun main() {
    // Вложенные if-else конструкции
    val isExam = true
    val mark = 4
    var markName = ""

    if (isExam) {
        if (mark == 5) {
            markName = "Отлично"
        } else if (mark == 4) {
            markName = "Хорошо"
        } else {
            markName = ""
        }

        if (markName.isEmpty()) {
            println("Стипендии не будет. Хотите пересдать?")
        } else {
            println("Ваша оценка: $markName")
        }
    } else {
        println("Эта оценка не повлияет на стипендию")
    }

    // Упрощенный if без фигурных скобок
    val isEmptySpaceShip = true
    if (isEmptySpaceShip)
        println("Корабль в данный момент пустой. Зайдите позднее.")
    else
        println("Проходите, вас уже ожидают.")

    // Проверка диапазона значений
    val temperature = 20
    if (temperature >= 18 && temperature <= 25) {
        println("Оптимальная температура")
    }
}