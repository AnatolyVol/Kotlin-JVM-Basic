package syntax.io

/*
 * Ввод и вывод данных в Kotlin
 */

fun main() {
    // Вывод текста без перевода строки
    print("Таков путь\nThis is the Way")

    // Вывод с переводом строки
    println("Таков путь")

    // Переменные для примера
    val userFirstName = "Anatoly"
    val userAge = 28

    // Конкатенация строк
    println("Привет, " + userFirstName + ". Это " + userAge)

    // Интерполяция строк (рекомендованный способ)
    println("Привет, $userFirstName")

    // Чтение данных с консоли (только в режиме выполнения в терминале)
    print("Введите ваше имя: ")
    val name = readln()
    println("Привет, $name!")
}