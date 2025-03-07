package syntax.basics

// Определение класса (ключевое слово `class`)
class SpaceshipNebula(var skinStrength: Int, var fuelQuantity: Double, var speed: Int)

private fun main() {
    // Создание объекта класса
    val mySpaceship = SpaceshipNebula(1000, 100.0, 3000)

    println("🚀 Объект создан!")
    println("Прочность корпуса: ${mySpaceship.skinStrength}")
    println("Топливо: ${mySpaceship.fuelQuantity}")
    println("Скорость: ${mySpaceship.speed}")

    // Изменение свойств объекта через оператор "."
    mySpaceship.skinStrength -= 50
    mySpaceship.fuelQuantity -= 30
    println("\n🔧 После изменений:")
    println("Прочность корпуса: ${mySpaceship.skinStrength}")
    println("Топливо: ${mySpaceship.fuelQuantity}")
}

/**
 * Подходы к созданию классов в Kotlin
 */

// Data class: используется, если класс нужен только для хранения данных
data class SpaceshipData(var skinStrength: Int, var fuelQuantity: Double, var speed: Int)

// Обычный класс с методами
class SpaceshipWithMethods(var skinStrength: Int, var fuelQuantity: Double, var speed: Int) {
    fun boostSpeed(boost: Int) {
        speed += boost
        println("💨 Скорость увеличена! Новая скорость: $speed")
    }

    fun getStatus(): String {
        return "Прочность: $skinStrength | Топливо: $fuelQuantity | Скорость: $speed"
    }
}

// Класс, содержащий только методы (без свойств)
class SpaceshipControl {
    fun calculateSpeed(startSpeed: Int, boost: Int): Int {
        return startSpeed + boost
    }

    fun printStatus(skinStrength: Int, fuelQuantity: Double, speed: Int) {
        println("📡 Текущий статус:")
        println("Прочность корпуса: $skinStrength")
        println("Топливо: $fuelQuantity")
        println("Скорость: $speed")
    }
}

// Пустой класс (может быть использован как заглушка)
class EmptySpaceship
