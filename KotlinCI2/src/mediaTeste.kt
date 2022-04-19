fun main(){
    print("Escreva o primeiro número: ")
    var numero1 = readLine()!!.toInt()

    print("Escreva o segundo número:")
    var numero2 = readLine()!!.toInt()

    var mediaDeles = media(numero1,numero2)

    println("A média entre $numero1 e $numero2 é: $mediaDeles")

}
fun media (n1:Int, n2:Int):Int{
    var media = (n1+n2)/2
    return media
}