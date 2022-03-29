fun main() {
    print("Escreva uma frase: ")

    var frase = readLine()!!

    var j = frase.length - 1

    while (j >= 0) {
        print("${frase[j]}")
        j -= 1
    }
}

