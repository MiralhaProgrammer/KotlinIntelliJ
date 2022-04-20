class Receita{

    lateinit var instrucoes:String //Variável vai ser criada posteriormente, PORÉM PRECISA SER INSTANCIADA, não pode ser val, precisa ser val

    fun geraReceita(){
        instrucoes = "Lave as mãos"
    }
    fun imprimeReceita(){
        if(!this::instrucoes.isInitialized)//Se a variável instruções não está inicializada "!"
        {
            instrucoes = "Lave as maõs"
        }
    }
}

fun main(){
    var r: Receita = Receita()
    r.geraReceita() //Da um valor para as instruções
    println(r.instrucoes) //Printa a instrução
}