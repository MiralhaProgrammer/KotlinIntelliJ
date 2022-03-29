fun main(){ //Somar todos os números entre 1 e 500
    var soma = 0 //A lógica começa com a soma que vale 0

    for (s in 1..500){

        soma = soma + s // O s é o segundo termo que começa em 1, e a soma é o resultado que precisa ser o primeiro número da variável
        println("A soma é: $soma")

    }
}