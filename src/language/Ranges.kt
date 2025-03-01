package language

/*
 * Диапазоны чисел (Ranges) в Kotlin
 */

fun main() {
    // Создание диапазона от 1 до 5 включительно
    val range = 1..5
    println(range.joinToString()) // 1, 2, 3, 4, 5

    // Диапазон с исключением последнего числа
    val firstSaleDay = 1
    val lastSaleDay = 14
    val saleDays = firstSaleDay until lastSaleDay // 1, 2, ..., 13
    println(saleDays.joinToString())

    // Обратный диапазон (убывание)
    val cookingTime = 10
    val countdown = cookingTime downTo 1 // 10, 9, ..., 1
    println(countdown.joinToString())

    // Диапазон с шагом
    val range2 = 10..20 step 2 // 10, 12, 14, ..., 20
    println(range2.joinToString())

    val range4 = 10 downTo 1 step 2 // 10, 8, 6, ..., 2
    println(range4.joinToString())

    // Проверка, находится ли число в диапазоне
    val rangeOne = 10..20
    val itemValue = 11

    if (itemValue in rangeOne) {
        println("Число $itemValue есть в заданном диапазоне")
    } else {
        println("Числа $itemValue в заданном диапазоне нет")
    }
}