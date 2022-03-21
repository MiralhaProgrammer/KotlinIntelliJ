fun main() {
    helloWorld() // Chamando a função de baixo na main

    val soma = sum(10, 20) // Esta criando uma variavel com aquela função
    println("A soma de 10 e 20 é: $soma")

    println("A soma de 10 e 5 é ${sum(10, 5)}") //Chamando a função e usando ela para somar

    val subtracao = sub(30,20)
    println("A subtração de 30 e 20 é: $subtracao")

    println("A subtração de 100 e 90 é: ${sub(100,90)}")
}

fun helloWorld() {
    println("Hello, World")
}

fun sum(a: Int, b: Int): Int { // Vai retornar um Int
    return a + b  // Vai retornar a soma deles
}

fun sub(c: Int, d: Int): Int {

    return c - d //Retorna subtração
}