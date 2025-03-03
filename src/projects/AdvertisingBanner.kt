package projects

private  fun main() {
    val datas = arrayOf(
        "Только сегодня! Спорткар за 9990 кредитов! Спешите купить!",
        "Новая часть культовой саги \"Звездные волны XIX\". Только в IMax5D!",
        "Заметил, что дроид уже не так эффективно работает? Чип I.A.M.D.N. уже в магазинах! Обнови своего дроида!"
    )

    val count = readln().toInt()

    repeat(count) {
        for (data in datas) {
            println(data + "\n")
        }
    }
}