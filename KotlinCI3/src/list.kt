fun main() {

    val lista: List <Int>  = listOf(1,2,3,4,5) //Lista destes numeros, declarando eles com lista, não pode ser modificada
    val lista2 = listOf(25,"oi", false)//Aceita diferentes parametros, val pois não é motificada

    var lista3: MutableList <Int> = mutableListOf<Int>(1,2,3,4,5) // Uma lista mutável, por poder ser mudada usa var

    println(lista2[0]) //Pega a posição 0, ou seja, o primeiro
    println(lista2[2]) //Sai o false
    println(lista2.size) // Tamanho da lista

    lista3.add(6) //Adiciona valores
    println(lista3)// Mostra a lista com valores

    lista3.remove(6) //Remove o 6 adicionado anteriormente
    lista3.removeAt(0) // Remova o primeiro algarismo
    println(lista3)

    lista3.contains(5)//Verifica se contem o 5, é booleano
    lista3.clear()//Limpa a lista
    println(lista3.contains(3)) //Falso pois limpamos a lista.


}
