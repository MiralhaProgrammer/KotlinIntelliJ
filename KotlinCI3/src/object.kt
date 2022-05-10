    class Matematica {

    var PIsemCom = 3.1415 //PI sem companion object

    companion object { //UM POR CLASSE
        var PI = 3.1415
        fun teste() {}

        init {
            println("Fui inicializado") //O init inicia com o código, mesmo não sendo chamado
        }
    }

    object obj1 { //Object precisa ter NOME EM TUDO

        fun soma() {}

    }

    object obj2 {
        fun subtracao() {}
    }
}

fun main() {
    var matExemplo = Matematica()
    matExemplo.PIsemCom // Precisa instanciar

    Matematica.PI //Com o companion object pode acessar sem instanciar
    Matematica.teste()

    Matematica.obj1.soma()
    Matematica.obj2.subtracao()//Object precisa ter nomes para utiliza-los
}