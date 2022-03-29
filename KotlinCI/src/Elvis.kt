fun main() {
    val palavra:String? = null

    println(palavra ?: "nulo") //Analisa o esquerdo, se for nulo, executa a ação da direita, no caso a palavra nula

    val palavra2 = if (palavra == null) "Palavra nula" else "palavra não nula" //If e else com atribuição de variavel em uma unica linha

}