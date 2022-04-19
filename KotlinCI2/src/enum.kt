enum class Prioridade { //Classe enumeradora, limita os valores
    Baixa, Media, Alta
}
enum class AnimalEnum{
    Cachorro, Gato, Cavalo, Vaca, Boi
}

fun usoDaPrioridade(uso: Prioridade){ //O uso é uma variável tipo prioridade

}

fun main() {

    for (i in Prioridade.values()){
        if (i == Prioridade.Alta){
            println("Chegou no alta")
        }
        println(i)// O i é o valor da prioridade
    }
}