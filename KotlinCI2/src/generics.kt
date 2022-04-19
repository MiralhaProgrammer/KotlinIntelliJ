fun main(){
    println( mediaa ("chato",2, false, ""))// Apenas uma variável J e depois começa o varag
    arrayOf(2,2,3,6,2,6,45f)//Array of usa vararg
    "miguel".startsWith("mi")
}

fun <T, J > mediaa ( avaliamento: J, vararg notas: T ):Float { //Indicando que a função tem variável genérica, que pode ser qualquer uma
    // O vararg precisa sempre ser o ultimo
    var soma = 0f

    for (n in notas){

        if (n is Float){ //Só soma se for float
            soma+=n
        }
        if (n is String){//Caso seja String faz outro tratamento

        }


    }

    return (soma/notas.size)
}