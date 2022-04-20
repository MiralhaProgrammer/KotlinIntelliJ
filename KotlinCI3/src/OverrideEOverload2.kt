open class MoveisDaCasa(var tipo:String){

   open fun abrirMovel(){
        println("$tipo puxado(a) para frente")
    }

    open fun fecharMovel(){
        println("$tipo empurrado(a) para tras")
    }

    fun nadaFeito(){
        println("Móvel/Ação não reconhecida. Nada feito.")
    }

}

class Porta(tipo:String): MoveisDaCasa(tipo){

    override fun abrirMovel(){
        println("$tipo, função sobrescrita. Abrir para o lado direito, porta de correr")

    }

    override fun fecharMovel() {
        println("$tipo, função sobrescrita. Fechar para o lado esquerdo, porta de correr")
    }
}

class Armario(tipo: String) : MoveisDaCasa(tipo){

    override fun abrirMovel() {
        println("$tipo, abrir para cima")
    }

    override fun fecharMovel() {
        println("$tipo, fechar para baixo")
    }

    fun trancarArmario(){
        println("$tipo trancado")
    }
}

fun main() {
    var porta: Porta = Porta("Porta")
    var armario: Armario = Armario("Armario")
    var moveisGerais: MoveisDaCasa = MoveisDaCasa("nenhum")

    println("Bom dia, O que o senhor deseja fazer?")
    var valorDigitado: String = readLine()!!.toString().lowercase()

   if (valorDigitado == "fechar a porta"){
       porta.fecharMovel()
   }

    else if (valorDigitado == "abrir a porta"){
        porta.abrirMovel()
    }

   else if (valorDigitado == "abrir o armario"){
       armario.abrirMovel()
   }

   else if (valorDigitado == "fechar o armario"){
       armario.abrirMovel()
   }

   else if (valorDigitado == "trancar o armario"){
       armario.trancarArmario()
   }
   else{
       moveisGerais.nadaFeito()
   }



}