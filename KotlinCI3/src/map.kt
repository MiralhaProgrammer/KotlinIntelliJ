//Map funciona com chaves, para cada chave, adiciona um valor
// CHAVE -> VALOR, nessa ordem
fun main() {
    val map1 = mapOf<String, Int>(Pair("Conde", 2), Pair("Chave lol", 50)) //A chave precisa ser única, não sobrescrever
    var map2 = mutableMapOf<String, String>(Pair("São Paulo", "Guarulhos"))

    map2["Brasil"] = "São Paulo" //Adicionando valores com chave brasil e dados são paulo

    println(map1)
    println(map1.entries) //Todas as chaves
    println(map1.values) //Todos os valores
    println(map2)

    map2.remove("Brasil") // Remove pela chave
    map2.contains("São Paulo") //Vê se contém aquele valor pela chave
    map2.clear() //Limpa a lista
}