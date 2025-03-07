package syntax.basics


/**
 * Конструкторы в Kotlin
 * Конструкторы используются для создания объектов и инициализации их свойств.
 */

// Первичный конструктор (основной случай)
class Fruit(val name: String, val cost: Int)

// Вторичный конструктор с проверками
class FruitWithChecks {
    val name: String
    val cost: Int

    constructor(inputName: String, inputCost: Int) {
        require(inputName.isNotEmpty()) { "Ошибка. Имя фрукта незаполнено" }
        require(inputCost > 0) { "Ошибка. Некорректная стоимость фрукта" }

        name = inputName
        cost = inputCost
    }
}

// Конструктор по умолчанию (без параметров)
class DefaultFruit
class DefaultFruit2()

// Комбинация первичного и вторичного конструктора
class FruitWithId(val name: String, val cost: Int) {
    var id: String = ""

    constructor(inputName: String, inputCost: Int, inputId: String) : this(inputName, inputCost) {
        require(inputName.isNotEmpty()) { "Ошибка. Имя фрукта незаполнено" }
        require(inputCost > 0) { "Ошибка. Некорректная стоимость фрукта" }

        id = inputId
    }
}

/**
 * Блоки инициализации (init)
 * Используются для выполнения кода при создании объекта.
 */
class Person(val name: String, var age: Int) {
    init {
        println("Создан объект Person с именем $name и возрастом $age")
    }

    init {
        println("Дополнительный блок инициализации")
    }
}

/**
 * Ключевое слово "this"
 * Используется для ссылки на текущий объект внутри класса.
 */
class Example {
    var value: Int = 0

    fun setCustomValue(value: Int) {
        this.value = value // Используем this, чтобы отличить свойство класса от параметра
    }

    fun printValue() {
        println("Значение: ${this.value}")
    }
}

private fun main() {
    // Тестируем первичный конструктор
    val apple = Fruit("Яблоко", 30)
    println("Фрукт: ${apple.name}, Цена: ${apple.cost}")

    // Тестируем вторичный конструктор с проверками
    val banana = FruitWithChecks("Банан", 25)
    println("Фрукт: ${banana.name}, Цена: ${banana.cost}")

    // Тестируем конструктор с id
    val orange = FruitWithId("Апельсин", 40, "id-123")
    println("Фрукт: ${orange.name}, ID: ${orange.id}")

    // Тестируем блок init
    val person = Person("Иван", 25)

    // Тестируем ключевое слово this
    val example = Example()
    example.setCustomValue(42)
    example.printValue()
}