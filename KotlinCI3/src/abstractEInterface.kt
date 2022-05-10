interface Selvagem { //Interface é um contrato que quem assina precisa implementar, é obrigatório a ATACAR
    fun atacar() {
        println("O animal está atacando")
    }

    //Em interface não é possível declarar variáveis
}

abstract class Mamiferos(val nome: String) {
    fun acordar() {}
    fun dormir() {}

    abstract fun seDefender()
    abstract fun falar() //Tira a necessidade de usar open toda hora, o objetivo dela é servir de molde.

}

class Funcionario() {}
class Programador() {}
class Montador() {}

class Cachorro(nome: String) : Mamiferos(nome), Selvagem {
    override fun seDefender() {
        TODO("Not yet implemented")
    }

    override fun falar() {
        println("Cachorro falando")
    }
}

class Gato(nome: String) : Mamiferos(nome), Selvagem {
    override fun seDefender() {
        TODO("Not yet implemented")
    }

    override fun falar() {// Na classe abstrata, precisa instanciar todas as classes abstratas herdadas.
        println("Estou falando")
    }
}

fun main() {
    var cachorro = Cachorro("York Shyre")
    cachorro.falar()
    cachorro.atacar()
}