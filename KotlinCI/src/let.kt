fun main() {
    val palavra: String? = null

    palavra?.let { //Só é executado caso seja diferente de nulo
        it.lowercase() //Você usa a string como it
        it.length
    }
}