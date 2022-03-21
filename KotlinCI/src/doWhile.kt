fun main() {

    var i = 0
    do{
        print("$i") //Printa o valor do i na tela
        i++ //Incrementa 1
    }while (i<10) //o doWhile não faz verificação primeiro, mas ele volta no laço se for verdadeiro

    do{
        print("Informe seu nome: ")
        var nome = readLine()
    }while (nome == "") //Se informar nome vazio, o programa não aceita e volta
}