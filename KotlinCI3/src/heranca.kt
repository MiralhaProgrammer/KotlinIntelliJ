private class random //Limita a classe somente AO ARQUIVO, no caso, heranca.kt

open class Eletronico(var marca:String){ //Para definir uma classe de herança

    private fun ativarCorrente(){} //Limita o método somente a classe, ou seja, pertence somente a classe eletronico, não podendo ser usada na classe computador
    protected fun desativarCorrente(){} //As classes hedardas também enxergam, é o private porém MENOS RÍGIDO

    fun ligar(){
        ativarCorrente() //Abstração, esconder a classe, o usuário em si não ve, mas existe
    }
    fun desligar(){
        println("Computador desligando")
    }
}

public class Computador(marca:String) : Eletronico (marca) { //Public, modificador público acessado a todos, redundante
    fun instalar(){}

    fun processar(){
    }

    fun desligarCorrente(){
        var desligarCorrente: Computador = Computador("Dell")
        desligarCorrente.desativarCorrente() //Pode ser usado NA CLASSE HERDADA
    }



}

fun main() {
 var computador: Computador = Computador("Positivo")
    computador.ligar()
    computador.desligar()

}