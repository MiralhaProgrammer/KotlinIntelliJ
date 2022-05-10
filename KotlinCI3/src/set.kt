//Não tem obrigatóriamente uma sequência ordenada, diferente da lista
//O set não permite valores duplicados
//Não consegue acessar o index
fun main() {
    val set1:Set<String> = setOf<String>("Pariz", "Berlim", "Berlim")
    var set2:MutableSet<String> = mutableSetOf<String>()

    println(set1) //Não repete Berlim

    set2.add("5")
    println(set2)
    println(set2.contains("10"))
}