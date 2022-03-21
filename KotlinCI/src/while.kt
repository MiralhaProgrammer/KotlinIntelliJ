fun main() {
    var s = "Kotlin é muito legal e eu amo muito"
    var i = 0
    var j = 0
    var k = 0
    var l = 100

    while (i < 100) {
        print("linha $i: Menor que 100")
        i++
    }

    while (j < s.length) { //Enquanto j = 0 for menor que o número dos caracteres da palavra s =35, executar
        println("$j é menor que ${s.length}")
        j += 3 //Incrementa de 3 em 3
    }
    while (k<s.length){ //Enquanto a posição for menor que o número de letras da palavra no S, acessa o S na posição k, escrevendo a palavra
        print("${s[k]}")
        k++
    }

    while (l > 0){ //Decrescente
        print("$l")
        l--
    }


}