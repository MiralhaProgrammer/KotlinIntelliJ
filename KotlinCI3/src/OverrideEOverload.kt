open class Eletronico2( var marca:String){
    private fun corrente(ativo:Boolean){}
    fun ligar(){
        corrente(true)
    }
    open fun desligar(){ //Precisar ter open para sobrescrever
        corrente(false)
    }
}

class Computador2(marca:String) : Eletronico2(marca){

    override fun desligar(){ //Sobrescreve a função desligar, com um novo comportamento
        save()
       super.desligar()// O método da classe mãe, no caso o SUPER DA CLASSE ELETRONICO2.
    }
    fun save (){}
    fun save (a: Int){}// Funciona pois a assinatura da função é diferente ,OVERLOAD, é como se fossem funções diferentes

}

fun main() {
    val computer: Computador2 = Computador2("Genérica")
    computer.ligar()
    computer.desligar()
    computer.save()
}