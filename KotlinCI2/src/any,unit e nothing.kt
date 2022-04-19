fun main() {
    //Any, Unit e Nothing
    //Any = assume o valor de qualquer variável
    //Unit = função não tem retorno, geralmente não utilizamos, pois kotlin não precisa
    //Nothing = serve para retornar excessão, ele atira uma excessão, geralmente quando ainda não fez aquela parte

    print(valorqualquer("oi tudo bem"))
    outrovalorqualquer(25) //Consigo chamar graças ao nothing
}

fun valorqualquer(valor: Any): Unit{
    print(valor)
}

fun outrovalorqualquer(valoraleatorio:Any):Nothing{
TODO("Não tive tempo") //Lança uma excessão com uma razão escrita em string
}