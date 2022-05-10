interface Event {
    fun onSucess()
}

class Programa {

    fun salvar (e: Event){ // Herda a interface do tipo evento
        println("Abrindo conexões.")
        println("Fechando conexões")
        println("Sucesso. Conexões fechadas.")
        e.onSucess()//Usa a função evento do sucesso
    }

}

fun main() {
    val programa = Programa()
    //É obrigatório implementar o onSucess pois é uma interface, como visto anteriormente
    programa.salvar(object:Event{ //Classe anônima, existe uma classe que não é vista
        override fun onSucess() {
            print("onSucess")
        }

    })
}