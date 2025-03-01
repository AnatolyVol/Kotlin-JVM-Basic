package syntax.basics

/*
 * Переменные и типы данных в Kotlin
 */

fun main() {
    // Константа (неизменяемая переменная)
    val userFirstName = "Anatoly"

    // Изменяемая переменная
    var userAge: Int = 28

    // Отложенная инициализация переменной (только для var)
    lateinit var userLastName: String

    // Числовые типы данных
    val minValue: Int = 100
    val maxValue: Long = 100L

    // Беззнаковые числа (только положительные)
    val finalDroidCount: UByte = 255U  // Аналог Byte, но без отрицательных значений
    val carCount: UShort = 60000U      // Аналог Short, но только положительные числа
    val starCount: UInt = 15U          // Аналог Int, но без отрицательных значений

    // Вещественные числа
    val firstWeight: Double = 2.5  // Тип Double (по умолчанию)
    val secondWeight: Float = 2.5f // Тип Float (нужно указывать 'f' в конце)

    // Строки и текстовые данные
    val pair: String = "Планета: Земля\nСпутник: Луна"
    val spaceshipName: String = "Крейсер \"Галактика\""

    // Многострочный текст (raw string)
    val battleReport: String = """
        Генерал, в этом сражении Вы одержали победу над 128 дроидами.
        Это на 17 меньше, чем в битве при Ириадии. 
        Что будете делать?
    """.trimIndent()

    // Логические значения (Boolean)
    val isReadySpaceShip: Boolean = false
    val isEmptySpaceShip: Boolean = true

    // Преобразование типов
    val newNumberTwo: Int = carCount.toInt() // UShort -> Int
    val newNumberThree: String = minValue.toString() // Int -> String

    // Выводим данные в консоль (для теста)
    println(pair)
    println(spaceshipName)
    println(battleReport)
    println("Корабль готов? $isReadySpaceShip")
    println("Корабль пуст? $isEmptySpaceShip")
}