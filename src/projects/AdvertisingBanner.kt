package projects

private  fun main() {
    val dataAuto = getDataAuto()
    val dataMovie = getDataMovie()
    val dataDroid = getDataDroid()

    val context = readln()
    val count = readln().toInt()

    when (context) {
        "Авто"  -> showBillBoard(count, dataAuto)
        "Кино"  -> showBillBoard(count, dataMovie)
        "Дроиды"  -> showBillBoard(count, dataDroid)
    }
}

private fun showBillBoard(count: Int, dataAdv: Array<String>) {
    repeat(count) {
        for (data in dataAdv) {
            println(data)
            Thread.sleep(1000)
        }
        println()
        Thread.sleep(3000)
    }
}

private fun getDataAuto(): Array<String> {
    val dataAuto = arrayOf(
        "Только сегодня! Спорткар за 9990 кредитов! Спешите купить!",
        "Встречайте первый Галактический спорткар с открытым верхом. Ограниченная серия уже в нашем магазине!",
        "Опаздываешь на важные встречи? Покупай спорткар с квантовым двигателем всего за 29990 кредитов!"
    )
    return  dataAuto
}

private fun getDataMovie(): Array<String> {
    val dataAuto = arrayOf(
        "Новая часть культовой саги \"Звездные волны XIX\". Только в IMax5D!",
        "Что победит - деньги или любовь? Продолжение легендарного фильма \"Летучая мышь в черном\" уже в кинотеатрах!",
        "Ежегодная часть \"Елочки-Иголочки\" уже в кино! Скорее в кинотеатры!"
    )
    return  dataAuto
}

private fun getDataDroid(): Array<String> {
    val dataAuto = arrayOf(
        "Заметил, что дроид уже не так эффективно работает? Чип IAMD уже в магазинах! Обнови своего дроида!",
        "Мощнее в 1,5 раза! Дороже в 2 раза! Приобретай нашего дроида!",
        "Любишь дорогих роботов? Прошлые поколения уже не радуют? Только для тебя! Золотой дроид с инкрустацией драгоценными камнями за 20000 кредитов!"
    )
    return  dataAuto
}