package syntax.functions

/*
 * Функции в Kotlin
 */

// Функция без параметров и возвращаемого значения
fun read() {
    println("Чтение данных...")
}

// Функция, возвращающая строку
fun read1(): String {
    return "Hello, World!"
}

// Функция с параметрами
fun read(openSource: String, privateSource: String): String {
    return "Открытый источник: $openSource, Закрытый источник: $privateSource"
}

// Функция с параметрами по умолчанию
fun read3(
    openSource: String = "Открытый ресурс",
    privateSource: String = "Закрытый ресурс"
): String {
    return "Открытый: $openSource, Закрытый: $privateSource"
}

// Функция с разными типами параметров
fun calculateSpaceCats(
    cats: Array<String>, // обязательный параметр
    isReallySpace: Boolean = true, // параметр со значением по умолчанию
    isFindSpaceship: Boolean = true, // параметр со значением по умолчанию
    searchRadius: Double = 5.5, // параметр со значением по умолчанию
    startPointX: Double = 0.0, // координаты
    startPointY: Double = 0.0,
    startPointZ: Double = 0.0
) {
    println("Поиск космических котов...")
    println("Обнаружено: ${cats.size} котов")
    println("Радиус поиска: $searchRadius")
    println("Начальная точка: ($startPointX, $startPointY, $startPointZ)")
    println("Реальный космос? $isReallySpace, Ищем корабль? $isFindSpaceship")
}

fun main() {
    read() // Вызов функции без параметров

    val greeting = read1()
    println(greeting) // Вывод результата функции

    val info = read("GitHub", "Secure Database")
    println(info)

    val defaultInfo = read3()
    println(defaultInfo)

    val cats = arrayOf("Барсик", "Рыжик", "КосмоКот")
    calculateSpaceCats(cats)
}

