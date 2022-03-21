fun main() { //Incrementa
    for (i in 0..10 step 2){ //Vai dos números 1 até 10 de 2 em 2
        print("$i")
    }

    for (j in 20 downTo 0 step 2){ //decresce de 2 em 2
        println("$j")
    }

    val palavra = "Kotlin é show!"
    for (char in palavra){ //Uma lógica complexa, o char exibe 1 caractere por 1, somando +1 e indo para o próximo até acabar
        print ("$char")
    }
}