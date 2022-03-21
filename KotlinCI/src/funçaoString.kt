fun main() {
    val string = "Miguel Lindo"

    println("Tamanho da string: ${string.length}")

    println("Posição (index) 0 da string: ${string[0]}") //Kotlin e Java começa no 0
    println(string.startsWith("Mig")) //Se minha função começa com "mig", retorno booleano
    println(string.endsWith("abc")) //Se termina com "abc", retorna booleano

    println(string.substring(2, 4)) // Vai pegar os caracteres da posição 2 até 4
    println(string.replace("Lindo", "Feio")) //Troca onde está lindo para feio
    println(string.lowercase())// Converte caracteres para minusculo
    println(string.uppercase())// Converte tudo para maiusculo

    println("  meu nome é  ".trim())// Muito usada em formulário, remove espaços em branco do começo e do final da palavra
}