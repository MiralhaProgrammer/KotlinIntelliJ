class Pessoa(var anoDeNascimento: Int, var nomeDaPessoa:String){
    //Construtor primário: Não temos visibilidade
    //Construtor secundário: É visto
    //Não pode colocar val ou var no construtor secundário
    //Construtor: Alocação de recursos para funcionamento além da definição inicial das variável

    var documento: String = ""
    var olhos = ""

    var doc:String = "" //Define a mesma do construtor para poder acessá-la em outro lugar
    constructor(anoDeNascimento: Int, nomeDaPessoa: String, doc: String):this(anoDeNascimento, nomeDaPessoa){
        this.doc = doc // A variável doc DO CONSTRUTOR é igual a doc de cima da string, para poder acessá-la mais tarde
    } //O doc foi adicionado, estava fora do conceito inicial
    // Para isso que serve o construtor



    fun dormir(){

    }

    fun acordar(){

    }
}

class Vazia private constructor() // Um construtor privado


fun main() {

    //class = comportamentos e atributos

    //A classe gera os objetos
    var pessoaRandom: Pessoa = Pessoa(nomeDaPessoa = "Miguel", anoDeNascimento = 2010) //É uma variável do tipo "classe pessoa" com os dados dela
    var pessoaPrimaria: Pessoa = Pessoa(anoDeNascimento = 2020, nomeDaPessoa = "Pedro Mota", doc = "X1X33463") //Classe com parametros do construtor

    pessoaRandom.dormir()
    pessoaRandom.acordar()
    pessoaRandom.olhos = "verdes"

    pessoaRandom.nomeDaPessoa = "Leticia" //Tranformando o nome da pessoa para leticia
    println("Meu nome é: ${pessoaRandom.nomeDaPessoa}" )

    Exception()
    Exception("Mensagem de erro")

}