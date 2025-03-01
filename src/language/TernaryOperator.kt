package language

/*
 * Тернарный оператор в Kotlin (альтернатива через if и when)
 */

fun main() {
    val mark1 = 4 // Оценка
    val markName1 = if (mark1 == 5) {
        "Отлично"
    } else if (mark1 == 4) {
        "Хорошо"
    } else if (mark1 == 3) {
        "Удовлетворительно"
    } else {
        "Неудовлетворительно"
    }
    println("Оценка 1: $markName1")

    // Альтернатива с when (более читаемая и предпочтительная)
    val mark2 = 4 // Оценка
    val markName2 = when (mark2) {
        5 -> "Отлично"
        4 -> "Хорошо"
        3 -> "Удовлетворительно"
        else -> "Неудовлетворительно"
    }
    println("Оценка 2: $markName2")
}