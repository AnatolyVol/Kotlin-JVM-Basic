package language

/*
 * Операции в Kotlin
 */

fun main() {
    // Инкремент и декремент
    var droidCount = 5
    println(droidCount)      // 5
    println(++droidCount)    // 6 (префиксный инкремент)

    var droidCountTwo = 5
    println(droidCountTwo)   // 5
    println(droidCountTwo++) // 5 (постфиксный инкремент, сначала вывод, потом увеличение)
    println(droidCountTwo)   // 6

    // Арифметические операции
    val result1 = 5 / 2
    println(result1) // 2 (целочисленное деление)

    val result2 = 5.0 / 2
    println(result2) // 2.5 (деление с дробной частью)

    val result3 = 5 * 2
    println(result3) // 10

    val result4 = 5.5 * 2
    println(result4) // 11.0

    val result5 = 11 % 9
    println(result5) // 2 (остаток от деления)

    // Операторы присваивания
    var jediMoney = 10
    jediMoney *= 100 // умножаем на 100
    println(jediMoney) // 1000

    // Операторы сравнения
    val droidNumber = 4
    println(droidNumber > 5)  // false
    println(droidNumber >= 4) // true
    println(droidNumber < 4)  // false
    println(droidNumber == 4) // true
    println(droidNumber <= 4) // true
    println(droidNumber != 4) // false

    // Логические операторы
    val droidCountThree = 5
    val jediCount = 2
    println(jediCount != 0 && droidCountThree != 0) // true (логическое "И")
    println(jediCount > 0 || droidCountThree == 0)  // true (логическое "ИЛИ")
}