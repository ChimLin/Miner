import kotlin.random.Random

fun main(args: Array<String>){
    print("How many mines do you want on the field?")
    var number = readLine()!!.toInt()

    var coordiantes: MutableList<MutableList<String>> = mutableListOf()
    for(i in 0..8){
        coordiantes.add(mutableListOf(".",".",".",".",".",".",".",".","."))
    }
    while(number != 0){
        var xCoordinate = Random.nextInt(0,8)
        var yCoordinate = Random.nextInt(0,8)
        if(coordiantes[xCoordinate][yCoordinate] == "X"){
            continue
        }else{
            coordiantes[xCoordinate][yCoordinate] = "X"
            number--
        }
    }

    for(i in coordiantes){
        println(i.joinToString(""))
    }
}
