class Animal(var especie: String){
    //Encapsulamento: Esconder alguma informação, alguma variável

    var fala: String = "" //Fala começa vazio
    init {//Bloco que vai ser executado quando a classe for criada

        if (especie == "Cachorro"){ fala = "au" } //Caso seja cachorro, a fala vazia vira AU e assim por diante
        else if (especie == "Gato"){fala = "miau"}
        else if (especie =="Porco"){fala = "oinc"}
        else {fala = ""}
    }

    fun falar(){
        println("A espécie é $fala")
    }

    init {
        println("Executa em segundo, na ordem em que os inits foram criados")
    }
}

fun main() {
 Animal("Porco").falar() //Puxar a classe animal com o método falar, que printa a espécie.
    
    var planeta:Planeta = Planeta()
    planeta.saldo2 = "25"

}