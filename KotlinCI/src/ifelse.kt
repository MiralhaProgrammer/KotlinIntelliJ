fun main() {
    maiorDeidade(18) //Estipulando uma idade
    maiorDeidade(19)
    maiorDeidade(9)
    maiorDeidade(14)
    preco(245)
}

fun maiorDeidade(idade: Int) {
    if (idade >=18){ //Condição de maioridade
        println("Maior de idade")

        if (idade>=60){
            println("Idoso")
        }

        else {
            println("Adulto")
        }
    }

    else if (idade<=10){//Estipular outra condição
        println("Criança")
    }

    else {
        println("Menor de idade") //If else ou é um ou é outro
    }
}

fun saudacao(dia:Boolean) = if (dia){ "Bom dia" } else {"Boa noite"} //Em uma linha só
fun preco(valor:Int) = if (valor>50){ println("muito caro")} else{ println("muito barato") }

