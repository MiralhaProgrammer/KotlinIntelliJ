fun main() {
    print("Digite um valor: ")
    var valorRecebido = readLine()!!.toInt()
    var valor2 = 1

    for (s in 1.. valorRecebido){//Vai executar o numero de vezes digitado

        for(i in 1..valor2){ //Na primeira vai executar uma vez, vai acabar o laço e vai voltar para executar 2 vezes, depois 3,
            // até finalizar o número for do valor recebido
            print("#")
        }
        valor2 += 1
        println("")
    }
}