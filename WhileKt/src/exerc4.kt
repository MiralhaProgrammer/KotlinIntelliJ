fun main() {
print("Digite uma palavra: ")
    var p = readLine()!!.uppercase()
    println("A condição é: ${palavraRecebida(p)}")
}

fun palavraRecebida(palavra:String):Boolean{


    var condition:Boolean = false//Condição que retorna

    var pl = palavra.length //Tamanho total da palavra

    var numO = 0 //Número de letras O
    var numX = 0 // Número de letras X
    var n = 0 // Número para trabalhar o while

    while(n < pl){ // Se a palavra tiver 20 caracteres vai rodas 20 vezes

        if (palavra[n] == 'X'){ //Caso o caractere em questão tenha x, ADICIONA 1 ao número X
        numX += 1
        }
        if (palavra[n] == 'O'){ // Caso o caractere em questão tenha o, adiciona 1 ao número O
        numO += 1
        }
        n += 1 // Vao rodar 20 vezes pois neste while, incremente 1 no 1 até ele ter o tamanho da palavra. 1,2,3 ... 20
    }

    if (numO == numX && numO != 0 && numX !=0){ //Se o número for igual condição vira true
        condition = true
    }

    else if (numO == 0 && numX == 0){ //Caso sejam 0, retorna false com não existe
        println("Não existe X nem O")
        condition = false
    }

    return condition
}