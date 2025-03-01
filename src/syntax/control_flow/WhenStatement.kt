package syntax.control_flow

/*
 * Условный оператор when в Kotlin
 */

fun main() {
    val nameTwo = "Энакин"
    val money = 1000
    var price = 0

    // Использование when с переменной
    when (nameTwo) {
        "Энакин" -> price = when {
            money < 1000 -> 500
            money < 2000 -> 1000
            else -> 3000
        }
        "Асока" -> price = when {
            money < 1000 -> 500
            money < 2000 -> 1500
            else -> 3500
        }
    }

    println("Цена для $nameTwo: $price кредитов")

    val nameThree = "Энакин"
    val moneyOne = 1000
    var priceOne = 0

    // Вложенные when можно сократить, используя вычисления внутри первого when
    priceOne = when (nameThree) {
        "Энакин" -> when {
            moneyOne < 1000 -> 500
            moneyOne < 2000 -> 1000
            else -> 3000
        }
        "Асока" -> when {
            moneyOne < 1000 -> 500
            moneyOne < 2000 -> 1500
            else -> 3500
        }
        else -> 0
    }

    println("Цена для $nameThree: $priceOne кредитов")
}