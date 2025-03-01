package syntax.control_flow

/*
 * Цикл For и команда repeat() в Kotlin
 */

fun main() {
    // Обычный цикл for по диапазону
    for (i in 1..5) {
        println("Итерация $i")
    }

    // Цикл for с шагом
    for (i in 1..10 step 2) {
        println("Число с шагом 2: $i")
    }

    // Обратный цикл for (убывание)
    for (i in 10 downTo 1) {
        println("Обратный отсчет: $i")
    }

    // Цикл for по массиву
    val planets = listOf("Меркурий", "Венера", "Земля", "Марс")
    for (planet in planets) {
        println("Планета: $planet")
    }

    // Цикл for с индексом (итерация по списку с индексами)
    for ((index, planet) in planets.withIndex()) {
        println("Планета #${index + 1}: $planet")
    }

    // Команда repeat() - повторение кода заданное количество раз
    repeat(3) {
        println("Дроиды атакуют!")
    }
}