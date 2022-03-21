fun main() {

    var i = 0

    while (i < 200000){ //Enquanto i for menor que 200000 executa

        if (i==10){ //Se o valor de i for igual a 10, para o programa
            println("Chegou a 10, programa encerrado")
            break //O break para o programa inteiro
        }

        println("$i") //Printa o i
        i++// Incrementa o laço
    }
//continue: o continue é o contrário do break, porém se ele passa pelo continue, ignora todo o codigo embaixo

}