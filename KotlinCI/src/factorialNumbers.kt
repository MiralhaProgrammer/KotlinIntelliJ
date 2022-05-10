fun main() {

    print("Insert the number (0-10) : ")
    val userNumber = readLine()!!.toInt() //userText

    var result: Int = operation(userNumber) //Call Operation
    println("The factory of: $userNumber! is $result")

}

fun operation(userNumber: Int): Int{
    var result:Int = 0
    var i = userNumber - 1
    var userNumber2 = userNumber //Decreases 1

    for (i in i downTo 1 step 1){
        result = userNumber2*i
        userNumber2 = result
    }

    return result
}