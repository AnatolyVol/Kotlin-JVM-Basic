package syntax.basics

/**
 * Наследование и модификаторы доступа в Kotlin
 * -----------------------------------------------
 * В Kotlin классы по умолчанию "final" (запрещено наследование).
 * Чтобы разрешить наследование, используем ключевое слово "open".
 */

// Родительский класс с protected полями
open class BaseSpaceship(
    protected var skinStrength: Int,
    protected var fuelQuantity: Double,
    protected var speed: Int
)

// Дочерний класс, наследующий BaseSpaceship
class AdvancedSpaceship(skinStrength: Int, fuelQuantity: Double, speed: Int) :
    BaseSpaceship(skinStrength, fuelQuantity, speed)

/**
 * 🔹 Модификаторы доступа:
 * private   - доступ только внутри класса.
 * protected - доступ внутри класса и в его наследниках.
 * public    - доступен везде.
 */

// private — недоступен в наследниках
open class PrivateClassExample(private val version: String, private var speed: Int)

class PrivateChildExample(speed: Int) : PrivateClassExample("Version 1", speed) {
    fun changeVersion() {
        // version = "Version 1.1" ❌ Ошибка: поле private недоступно в наследнике
    }
}

// public — доступен везде
open class PublicClassExample(var version: String, public var speed: Int)

class PublicChildExample(speed: Int) : PublicClassExample("Version 1", speed) {
    fun changeVersion(newVersion: String) {
        version = newVersion // ✅ Код выполнится без ошибок
    }
}

// protected — доступен только в наследниках
open class ProtectedClassExample(protected var version: String, protected var speed: Int)

class ProtectedChildExample(speed: Int) : ProtectedClassExample("Version 1", speed) {
    fun changeVersion(newVersion: String) {
        version = newVersion // ✅ Код выполнится без ошибок
    }
}

fun main() {
    val spaceship = AdvancedSpaceship(1000, 100.0, 3000)

    val publicTest = PublicChildExample(3000)
    println(publicTest.version) // ✅ Можно обратиться к полю

    val protectedTest = ProtectedChildExample(3000)
    // println(protectedTest.version) ❌ Ошибка: protected недоступен вне класса-наследника
}
