fun main() {
println("A soma de 10 e 5 é: ${sum3(10,5)}, enquanto a subtração de 30 e 20 é: ${sub3(30,20)}")
    println("A divisão entre 5 e 2.5 é ${div3(5f, 2.5f)}")
    val soma3 = sum3(40,20)
    val subtracao3 = sub3(40,30)
    val divisao3 = div3(10f,2.5f) //Precisa indicar que é float
    println("$soma3, $subtracao3, $divisao3")
    helloWorld3()
}

fun sum3 (a: Int, b: Int): Int = (a + b) // Com retorno
fun sub3 (c: Int, d:Int): Int = (c-d) //Com retorno
fun helloWorld3 () = println("Hello, World") // Sem retorno
fun div3 (e:Float, f: Float): Float = (e/f)


