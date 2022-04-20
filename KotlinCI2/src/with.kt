fun main() {
    val pessoa: Pessoa = Pessoa(2000, "Miguel") //Puxando classes
    pessoa.acordar()
    pessoa.dormir()

    with(pessoa){
        this.acordar()
        dormir()//Pode usar com ou sem o this
    } //With é para não ficar chamando toda hora pessoa.acordar, pessoa.dormir etc, ir direto
}