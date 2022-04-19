enum class Prioridade2(val id: Int) { //Classe enumeradora com id
    Baixa(1){
        override fun toString(): String { //Pega o poder de mexer com a string dela

            return "" //Anula o valor
        }
            },

    Media(5),
    Alta(15)
}
enum class AnimalEnum2{
    Cachorro, Gato, Cavalo, Vaca, Boi
}

fun usoDaPrioridade2(uso: Prioridade2){ //O uso é uma variável tipo prioridade


}

fun main() {

    for (i in Prioridade2.values()){
        println(i.id)// O i é o valor da prioridade
    }
}