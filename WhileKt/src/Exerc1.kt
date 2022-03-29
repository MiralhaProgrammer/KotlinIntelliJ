fun main() {
    var litroBalao = 7
    var numBalao = 0
    var litros = 2000

    while (litros > litroBalao){
        litros -= litroBalao
        numBalao+=1
    }
    println("Balão colocado! Número de balões: $numBalao")
}