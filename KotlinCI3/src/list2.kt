fun main() {
    val data = geraDados()
    data.any()//Mostra se existe algum resultado na lista, true ou false, booleano
    data.count()//Retorna a quantidade de ELEMENTOS
    data.first() //Primeiro item da lista
    data.last() //Ultimo item da lista
    listOf<Int>(1,2,3).sum() //Soma os itens da lista.
    data.sumOf { it.calorias } //Soma os dados numéricos, it pois é a receita, o dado que está sendo trabalhado
    data.filter { it.nome == "Lasanha" }  //Filtro, se existe algum elemento cujo nome é lasanha
    data.take(3)//Pega quantos elementos no começo quiser
    data.takeLast(2)// Pega quantos elementos quiser no final
    data.forEach { println(it.nome) }//Para cada item da lista, vai dar um print
    data.filter { it.calorias > 500 }.forEach { println(it.nome) } //Printa todos os nomes das calorias acima de 500
    // FILTER NÃO REPETE
    data.maxOf { it.calorias } //Qual é a receita que tem mais calorias
    data.minOf { it.calorias } //Qual é a receita que tem menos calorias
    data.map { Receita(it.nome, it.calorias) } //Mapeia o que voce quer, no caso, nome e calorias da receita
    data.maxByOrNull { it.calorias } //Parecido com o of, porém com nulo  e retorna o OBJETO, o nome
    data.minByOrNull { it.calorias } //Diferente do of, não retorna o número, mas sim o objeto junto
    listOf<Int>(2,4,6).average() //Média
    listOf<Int>(2,4,4,4,6,8).distinct() //Trazer elementos distintos, ou seja, não repete
    data.distinctBy { it.calorias } //Não imprime as calorias repetidas

    val listaInt = listOf<Int>(2,5,5,5,7,8,8,9,10)

    listaInt.distinct() //Traz elementos que não se repetem, sendo de qualquer tipo
    listaInt.sorted() //Ordena a lista
    listaInt.sortedDescending() //Ordena do maior pro menor
    listaInt.reversed() //Reverte a sequencia da lista

    data.map { it.calorias }.average()

    listOf<Int>(2,4,6).maxOf { it } //Maximo de lista vazio
    listOf<Int>(1,2,3).maxOrNull() //Maximo ou nulo
    listOf<Double>(1.2,3.4,4.9).minOf { it }
    listOf<Double>(4.1,4.2,5.9).minOrNull()

    val caloriasTotais:Int = data.sumOf { it.calorias }


    println(data.any()) //Retorna true, existem dados
    println(listOf<Int>().any()) //Retorna false, não tem nada na lista
    println(data.count())
    println("Tenho ${data.count()} receitas")
    println("Primeiro item: ${data.first().nome}")
    println("Ultimo item: ${data.last().nome}") //Precisa ser o nome que definimos, para nao retornar tudo
    println(listOf<String>().firstOrNull())// Não dar erro se for nula
    println(listOf<Int>().lastOrNull())
    println("Calorias totais: $caloriasTotais")
    println(data.filter { it.calorias >= 1000 }) //Pega elementos onde calorias é maior ou igual a 1000
    println(data.count { it.calorias >1000 }) // Conta quantas calorias acima de 1000
    println(data.take(2))
    println(data.takeLast(4))
    println(data.maxOf { it.calorias })
    println("O menor número da receita em calorias é: ${data.minOf { it.calorias }}")
    println("A média de calorias é: ${data.map { it.calorias }.average()}" )
    println(listaInt.distinct())
    println(data.distinctBy { it.nome }) //Imprime só os nomes distintos, ou seja, não repetidos.


}

fun geraDados() : List<Receita>{

    return listOf(Receita("Lasanha", 1000, listOf(
        Ingrediente("Molho de tomate", 2),
        Ingrediente("Massa", 1),
        Ingrediente("Mussarela", 3),
        Ingrediente("Presunto", 3),
        Ingrediente("Requeijão", 1)
    )),
        Receita("Cachorro quente", 500, listOf(
            Ingrediente("Maionese", 1),
            Ingrediente("Batata Palha", 1),
            Ingrediente("Mostarda",1),
            Ingrediente("Ketchup", 1),
            Ingrediente("Salsicha", 10),
            Ingrediente("Purê de batata", 1)


        )),
        Receita ("Refrigerante Zero", 0),
        Receita ("Paçoca", 500),
        Receita("Molhos", 5)
    )
}

data class Receita(val nome:String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
//List off vazio para não dar conflito se não colocá-la
data class Ingrediente(val nomeIngrediene: String, val quantidade: Int)