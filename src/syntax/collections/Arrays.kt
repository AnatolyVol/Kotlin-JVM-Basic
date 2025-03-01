package syntax.collections

/*
 * Массивы в Kotlin
 */

fun main() {
    // Создание массивов разных типов
    val planets = arrayOf("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон")
    val priceOfOrders = arrayOf(1250, 350, 7490, 19900)
    val statusOfOrders = arrayOf(true, false, true, true)

    // Получение элемента по индексу
    val planetName = planets[0]
    println("Первая планета: $planetName")

    // Перебор массива с доступом к соседнему элементу
    for (index in planets.indices) {
        if (index + 1 < planets.size) {
            println("${planets[index]} и ${planets[index + 1]}")
        }
    }

    // Фильтрация элементов по четным и нечетным индексам
    val orders = arrayOf("Заказ #1", "Заказ #2", "Заказ #3", "Заказ #4")

    println("Список приоритетных заказов:")
    for (index in orders.indices step 2) {
        println(" - ${orders[index]}")
    }

    println("Список неприоритетных заказов:")
    for (index in 1 until orders.size step 2) {
        println(" - ${orders[index]}")
    }

    // Создание массивов определенного типа
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val charArray = charArrayOf('A', 'B', 'C')
    val booleanArray = booleanArrayOf(true, false, true)
    val doubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    // Создание массива с пустыми значениями
    val maxGuestCount = 10
    val guests = Array<String>(maxGuestCount) { "" }

    // Разделение строки (split)
    val userName = "Jonny Jonson"
    val (firstName, secondName) = userName.split(" ")
    println("Имя: $firstName, Фамилия: $secondName")

    // Извлечение части строки (substringAfter)
    val inputData = "Ваше имя: Джонни Джонсон"
    val userNameExtracted = inputData.substringAfter("Ваше имя: ")
    println("Имя из строки: $userNameExtracted")

    // Сортировка массива (пузырьковая сортировка)
    val salaries = arrayOf(120000, 80000, 200000, 320000, 500000)
    for (i in salaries.indices) {
        for (j in salaries.indices) {
            if (salaries[i] < salaries[j]) {
                val tempSalary = salaries[i]
                salaries[i] = salaries[j]
                salaries[j] = tempSalary
            }
        }
    }
    println("Отсортированные зарплаты: ${salaries.joinToString()}")

    // Многомерные массивы
    val planetsAndSatellites = arrayOf(
        arrayOf("Меркурий", "Спутников нет"),
        arrayOf("Венера", "Спутников нет"),
        arrayOf("Земля", "Луна"),
        arrayOf("Марс", "Деймос", "Фобос"),
        arrayOf("Юпитер", "Ио", "Европа", "Ганимед", "Каллисто", "Пасифе", "Ананке", "Леда"),
        arrayOf("Сатурн", "Титан", "Рея", "Тефия", "Диона", "Энцелад", "Мимас", "Гиперион"),
        arrayOf("Уран", "27 спутников"),
        arrayOf("Нептун", "14 спутников"),
        arrayOf("Плутон", "5 спутников"),
    )

    // Вывод многомерного массива
    for (planet in planetsAndSatellites) {
        println("${planet[0]}: ${planet.drop(1).joinToString()}")
    }
}