fun main() { //Função quando
println(bonusWhen("Gerente"))
    val n = 20
    when(n){ //Condição para número entre 1 invervalo
        in 1..50 -> println("Está entre 1 e 50")
    }

    val condition = false
    when (condition){ //Condição de booleana para when
        false -> println("É falso")
        true -> println("Verdadeiro")
    }
}

fun bonusWhen(cargo:String):Float{
    var bonus = 0f
    when(cargo){ //Bonus baseado no cargo
        "Gerente" -> {bonus = 2000f}
        "Coordenador" -> {bonus = 1500f}
        "Engenheiro de software" -> {bonus = 1000f}
        "Estagiário" -> {bonus = 500f}
        else -> bonus = 0f
    }
    return bonus
}