/*  && Conjunção E And
    || Disjunção Or Ou
    in Intervalo de valores

    ex de uso if (numero in 1...50){ Se o número está entre 1 e 50
    }

    prioridade: Parenteses, negação, conjunção e por último disjunção

 */

fun main(){
    bonus("estagiário", 2)
}

fun bonus (cargo: String, experiencia: Int){
    if (cargo == "gerente"){
        if (experiencia < 2){
            println("R$2000 de bônus")
        }
        else {
            println("R$3000 de bônus")
        }
    }
    else if (cargo == "coordenador"){
        if (experiencia < 1){
            println("R$1500 de bônus")
        }
        else {
            println("R$1800 de bônus")
        }
    }
    else if(cargo == "engenheiro de software"){
        println("R$1000 de bônus")
    }
    else if (cargo == "estagiário"){
     println("R$500 de bônus")
    }
    else {
        println("Nenhum cargo")
    }
}
