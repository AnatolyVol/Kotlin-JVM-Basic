fun main() {

    /*
 * Переменные и типы данных
 */

    val userFirstName = "Anatoly"
    var userAge: Int = 28
    lateinit var userLastName: String

    val minValue = 100 // тип Int
    val maxValue = 100L // тип Long

    val finalDroidCount: UByte = 255U // положительный тип Bute
    val carCount: UShort = 60000U // положительный тип Short
    val starCount: UInt = 15U // положительный тип Int

    val firstWeight = 2.5 // тип Double
    val secondWeight = 2.5f // тип Float

    val pair = "Планета: Земля" + "\n" + "Спутник: Луна"
    val spaceshipName = "Крейсер \"Галактика\""
    val text = """
        Генерал, в этом сражении Вы одержали победу над 128 дроидами.
        Это на 17 меньше, чем в битве при Ириадии. 
        Что будете делать?
    """

    val isReadySpaceShip = false
    val isEmptySpaceShip = true

    val newNumberTwo = carCount.toInt()
    val newNumberThree = minValue.toString()

    /*
 * Ввод и вывод данных
 */

    print("Таков путь" + "\n" + "This is the Way")
    println("Таков путь")
    println("Привет, " + userFirstName + ". Это " + userAge)
    println("Привет, $userFirstName")

    val name = readln()
    println("Привет, ${readln()}!")

    /*
* Операции
*/

    var droidCount = 5
    println(droidCount) // выведет число 5
    println(++droidCount) // выведет число 6

    var droidCountTwo = 5
    println(droidCountTwo) // выведет число 5
    println(droidCountTwo++) // выведет число 5
    println(droidCountTwo) // выведет число 6

    val result1 = 5 / 2
    println(result1) // напечатает 2

    val result2 = 5.0 / 2
    println(result2) // напечатает 2.5

    val result3 = 5 * 2
    println(result3) // напечатает 10

    val result4 = 5.5 * 2
    println(result4) // напечатает 11.0

    val result5 = 11 % 9
    println(result5) // напечатает 2

    var jediMoney = 10 // количество кредитов у джедая равно 10
    jediMoney *= 100 // а сейчас у него уже 1000 кредитов

    val droidNumber = 4
    print(droidNumber > 5) // напечатает false
    print(droidNumber >= 4) // напечатает true
    print(droidNumber < 4) // напечатает false
    print(droidNumber == 4) // напечатает true
    print(droidNumber <= 4) // напечатает true
    print(droidNumber != 4) // напечатает false

    val droidCountThree = 5
    val jediCount = 2
    print(jediCount != 0 && droidCountThree != 0) // ИЛИ напечатает true
    print(jediCount > 0 || droidCountThree == 0) // И напечатает true

    /*
* Условный оператор if
*/

//    if (/* условие, возвращающее true или false */) {
//        // код, который будет выполнен, если условие истинно
//    }
//    else if (/* условие, возвращающее true или false */) {
//        // код, который будет выполнен, если условие истинно, а предыдущее условие ложно
//    }
//    else {
//        // код, который будет выполнен, если другие условия оказались ложными
//    }

    val isExam = true
    val mark = 4
    var markName = ""
    if (isExam) {
        if (mark == 5) {
            markName = "Отлично"
        } else if (mark == 4) {
            markName = "Хорошо"
        }

        if (markName == "") {
            println("Стипендии не будет. Хотите пересдать?")
        } else {
            print("Ваша оценка: " + markName)
        }
    } else {
        print("Эта оценка не повлияет на стипендию")
    }

    val isEmptySpaceShipTwo = true
    if (isEmptySpaceShipTwo)
        print("Корабль в данный момент пустой. Зайдите позднее.")
    else
        print("Проходите, вас уже ожидают.")

    val temperature = 20
    if (temperature >= 18 && temperature <= 25) {
        print("Оптимальная температура")
    }

    /*
* Диапазоны чисел
*/

    val range = 1 .. 5 // создает диапазон [1, 2, 3, 4, 5]

    val firstSaleDay = 1
    val lastSaleDay = 14
    val saleDays = firstSaleDay until lastSaleDay // создаём диапазон [1, 2, 3, .., 12, 13]

    val cookingTime = 10
    val countdown = cookingTime downTo 1 // 10 9 .. 2 1

    val range2 = 10..20 step 2 // 10 12 .. 18 20
    val range4 = 10 downTo 1 step 2 // 10 8 .. 4 2

    val rangeOne = 10..20 // 10 11 .. 19 20
    val itemValue = 11

    if(itemValue in rangeOne) { // проверяем, что значение есть в диапазоне
        println("Число 11 есть в заданном дипазоне")
    } else {
        println("Числа 11 в заданном дипазоне нет")
    }

    /*
* Условный оператор when
*/

//    when(/* переменная */) {
//        значение1 -> { /* если значение_переменной == значение1, выполнится код в этом блоке */ }
//        значение2 -> { /* если значение_переменной == значение2, выполнится код в этом блоке */ }
//        else -> { /* если предыдущие условия не выполнились, выполнится код в этом блоке */ }
//    }

//    when(/* переменная */) {
//        in значение1 .. значениеN1 -> { /* если значение_переменной в дипазоне между значение1 и значениеN1, выполнится код в этом блоке */ }
//        in значение2 .. значениеN2 -> { /* если значение_переменной в дипазоне между значение2 и значениеN2, выполнится код в этом блоке */ }
//        else -> { /* если предыдущие условия не выполнились, выполнится код в этом блоке */ }
//    }

//    when {
//        переменная1 == значение1 && переменная2 == значение2 -> { /* если значение_переменной1 равно значению1 и значение_переменной2 равно значению2, выполнится код в этом блоке */ }
//        переменная1 == значение3 || переменная2 == значение4 -> { /* если значение_переменной1 равно значению3 иом значение_переменной2 равно значению4, выполнится код в этом блоке */ }
//        else -> { /* если предыдущие условия не выполнились, выполнится код в этом блоке */ }
//    }

    val nameTwo = "Энакин"
    val money = 1000
    var price = 0
    when(nameTwo){
        "Энакин" -> {
            if (money < 1000) {
                price = 500
            } else if (money >= 1000 && money < 2000) {
                price = 1000
            } else {
                price = 3000
            }
        }
        "Асока" -> {
            if (money < 1000) {
                price = 500
            } else if (money >= 1000 && money < 2000) {
                price = 1500
            } else {
                price = 3500
            }
        }
    }

    val nameThree = "Энакин"
    val moneyOne = 1000
    var priceOne = 0
    when(nameThree){
        "Энакин" -> {
            when {
                moneyOne < 1000 -> {
                    priceOne = 500
                }
                moneyOne >= 1000 && moneyOne < 2000 -> {
                    priceOne = 1000
                }
                else -> {
                    priceOne = 3000
                }
            }
        }
        "Асока" -> {
            when {
                moneyOne < 1000 -> {
                    priceOne = 500
                }
                moneyOne >= 1000 && moneyOne < 2000 -> {
                    priceOne = 1500
                }
                else -> {
                    priceOne = 3500
                }
            }
        }
    }

    /*
* Тернарный оператор
*/

    val mark1 = 4 // Оценка
    var markName1 = "" // Название оценки
    markName1 = if (mark1 == 5) { // 1. условие не выполняется, оценка не равна 5
        "Отлично"
    }
    else if (mark1 == 4) { // 2. условие выполняется, оценка равна 4
        "Хорошо" // 3. выходим из блока; переменной "markName" присваивается значение "Хорошо"
    }
    else if (mark1 == 3) { // код не выполняется, поскольку уже вышли из блока
        "Удовлитеворительно"
    }
    else { // код не выполняется
        "Неудовлетворительно"
    }

    val mark2 = 4 // Оценка
    var markName2 = "" // Название оценки
    markName2 = when (mark2) {
        5 -> "Отлично"
        4 -> "Хорошо"
        3 -> "Удовлитеворительно"
        else -> "Неудовлетворительно"
    }

    /*
* Циклы While и Do..While
*/

//    while(/* условие */){
//        // блок кода, который будет исполняться, пока условие истинно
//    }

    var droidCount3 = 100
    val jediPower = 3
    while(droidCount3 > 0){ // пока количество дроидов больше 0
        droidCount3 -= jediPower // уменьшаем количество дроидов
    }

//    do {
//        // блок кода, который выполнится единожды и будет исполняться еще, если условие истинно
//    } while (/* условие */)

    val salary = 1000
    var jediMoney4 = 0
    do{ // заходим в блок
        jediMoney4 += salary // прибавляем зарплату к общей сумме у джедая на руках
    } while (jediMoney4 == 0) // проверяем условие, если количество денег равно 0, возвращаемся к началу блока; в нашем случае условие не выполняется, поскольку денег больше 0, выходим из цикла

    var username = ""
    while(true) { // пока условие истинно
        println("Введите имя пользователя: ") // отображаем подсказку
        val inputData = readln() // ожидаем ввод пользователя

        if(inputData != "") { // если введенная не строка пустая
            username = inputData // сохраняем введенное значение в переменную
            break // выходим из цикла
        }
    }

    /*
* Цикл For
*/

//    for(/* переменная */ in /* последовательность */) {
//        // код для выполнения на каждой итерации
//    }


    /*
* Команда repeat()
*/

//    repeat(/* число */) {
//        // код, который будет повторяться
//    }




}