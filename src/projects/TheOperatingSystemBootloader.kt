package projects

private fun main() {

    var clear = Array<Char>(10) { '░' }
    var printClear = ""
    var percent = 0

    for (i in clear.indices) {
        printClear += clear[i]
    }
    println("[$printClear] $percent%")
    Thread.sleep(1000)

    for (i in clear.indices) {
        var result = ""
        clear[i] = '█'
        percent += 10
        for (i in clear.indices) {
            result += clear[i]
        }
        println("[$result] $percent%")
        Thread.sleep(1000)
    }
}