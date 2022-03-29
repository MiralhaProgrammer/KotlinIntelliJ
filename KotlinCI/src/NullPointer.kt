fun main() {
    var palavra: String? = null // O ponto de interrogação é para permitir nulo
    print(palavra?.length) //Evita o nullpointer exception[
    print(palavra!!.length) // Coloca quando tem certeza que a variável não é nula e caso seja nula o programador assume o problema
}