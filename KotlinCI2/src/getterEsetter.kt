class Animais(var especie: String){
    //Isso é encapsulamento: Nem todos tem acesso á todas as variáveis
    var fala: String = ""

    get(){
        println("Acesso get")
        return field //Substitue a variável para não cair em loop
    }

    set(value) {
        println("Acesso set")
        field = value
    }

}

fun main() {
   var animais: Animais = Animais ("Cachorro")
    animais.fala = "Oi kk"
}