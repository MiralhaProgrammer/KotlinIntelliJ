open class MoveisDaCasa(var tipo: String) {
    var acaoFeita = "Ação concluída com sucesso!"
    var acaonaoFeita = "A ação falhou!"

    open fun abrirMovel() {
        println("$acaoFeita $tipo aberto(a)")
    }

    open fun fecharMovel() {
        println("$acaoFeita $tipo fechado(a)")
    }

    fun nadaFeito() {
        println("$acaonaoFeita Móvel/Ação não reconhecida. Nada feito.")
    }

}

class Armario(tipo: String) : MoveisDaCasa(tipo) {

    override fun abrirMovel() {
        println("$acaoFeita $tipo aberto para os dois lados.")
    }

    override fun fecharMovel() {
        println("$acaoFeita Os dois lados do $tipo foram fechados.")
    }

    fun trancarArmario() {
        println("$acaoFeita $tipo trancado")
    }
}

class Janela(tipo: String) : MoveisDaCasa(tipo) {
    override fun abrirMovel() {
        println("$acaoFeita Janelas abertas com sucesso. Favor verificar onde encontra-se o gato.")
    }

    override fun fecharMovel() {
        println("$acaoFeita Janelas fechadas. Verificar se o gato está dentro de casa.")
    }
}

class Porta(tipo: String) : MoveisDaCasa(tipo)

fun main() {
    var porta = Porta("Porta")
    var armario = Armario("Armario")
    var moveisGerais = MoveisDaCasa("nenhum")
    var janela = Janela("Janela")

    println("")
    println("Bom dia, O que o senhor deseja fazer?")
    var conndition: Boolean = true
    while (conndition) {//Enquanto a condição for verdadeira, executa

        print("")
        print("Digite a ação: ")
        var valorDigitado: String = readLine()!!.toString().lowercase()

        when (valorDigitado) {
            "fechar a porta" -> porta.fecharMovel()
            "abrir a porta" -> porta.abrirMovel()
            "abrir o armario" -> armario.abrirMovel()
            "fechar o armario" -> armario.fecharMovel()
            "trancar o armario" -> armario.trancarArmario()
            "abrir a janela" -> janela.abrirMovel()
            "fechar a janela" -> janela.fecharMovel()

            else -> {
                moveisGerais.nadaFeito()
            }
        }
        println("")
        println("Algo mais? responda SIM OU NÃO!")
        var algoMaisDigitado = readLine()!!.toString().lowercase()
        println("")

        if (algoMaisDigitado != "sim") {
            conndition = false
        }
    }
    println("Sessão encerrada. Obrigado por usar o programa!")
}