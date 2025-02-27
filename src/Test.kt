fun main(){
    val soldiers = readln().toInt()
    var soldierInGroup = 0
    var groups = 0

    for(soldierNumber in 1..soldiers){
        soldierInGroup += 1
        if(soldierInGroup == 8) {
            soldierInGroup = 0
            groups += 1
        } else if(soldierNumber + 8 > soldiers)  {
            groups += 1
            break
        }
    }

    print(groups)
}