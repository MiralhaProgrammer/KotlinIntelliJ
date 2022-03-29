//Calculadora
fun main() {
    print("Digite o primeiro valor:")
    var numeroDigitado1:Int = readLine()!!.toInt() //Digita os valores
    print("Digite o segundo valor:")
    var numeroDigitado2:Int = readLine()!!.toInt()
    println("Digite a operação desejada:")
    var condicao: String = readLine()!!.lowercase() //Digita a operação deixando ela toda minuscula

    var resultado: Int =  calculadora(numeroDigitado1, numeroDigitado2, condicao) // O return da função é int, então eu atribui uma variavel que recebe a
    //inteira que ela devolve, com os valores num1 e num2

    println("O resultado é: $resultado") //Printa a variável

}
fun calculadora(num1: Int, num2: Int, operacao: String):Int{ // A função que retorna int, tem 3 parametros, operação, numero 1 e numero 2

    var valor = 0

    if(operacao == "adição"){ //Se for adição o return vira soma e vice versa
        valor = num1 + num2
    }
    else if (operacao == "subtração"){
        valor = num1 - num2
    }
    else if (operacao == "divisão"){
        valor = num1/num2
    }
    else if (operacao == "multiplicação"){
        valor = num1*num2
    }
    else {valor = 0
    println("Valor incorreto digitado")
    }

    return valor


}