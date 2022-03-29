fun main() {
    var num = 1

    while (num<=50){

        if(num%3 == 0 && num%5 == 0){
            println("$num: É divisível por 3 e 5: FizzBuzz")
        }

        else if(num%5 == 0){
            println("$num: É divisível por 5: Fizz")
        }

        else if(num%3 == 0){
            println("$num: É divisível por 3: Buzz")
        }
        else {println("$num")}
        num+=1
    }
}