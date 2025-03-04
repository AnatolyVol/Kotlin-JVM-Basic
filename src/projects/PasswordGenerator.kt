package projects

private fun main() {

    println("Выберите пункт:")
    val input = readln().toInt()
    when (input) {
        1 -> setNumberCharacters()
        2 -> setTypeCharacters()
        3 -> generationPassword()
        4 -> exitProgram()
    }
}

private fun setNumberCharacters() {
//    println("1. Задать количество символов")
    println("Ожидается ввод данных")

}

private fun setTypeCharacters() {
//    println("2. Задать типы символов")
    println("Ожидается ввод данных")

}

private fun generationPassword() {
//    println("3. Сгенерировать пароль")
    println("Ожидается генерирование пароля")

}

private fun exitProgram() {
//    println("4. Выйти из программы")
    println("Ожидается выход из программы")

}