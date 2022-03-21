fun main() {
    var valor = bonus2("coordenador", 2)
    println("O bonus é: R$ $valor")
}

fun bonus2(cargo: String, experiencia: Int): Float { //Recebe o valor do cargo e dos anos de experiencia e baseado nestes valores, retorna um salário
    if (cargo == "gerente") {

        if (experiencia < 2) {
            return 2000f
        } else {
            return 3000f  //Quando tem SOMENTE uma instrução pode tirar as chaves
        }
    } else if (cargo == "coordenador") {
        if (experiencia < 1) {
            return 1500f
        } else {
            return 1800f
        }
    } else if (cargo == "engenheiro") {
        return 1000f
    } else if (cargo == "estagiário") {
        return 1000f
    } else {
        return 0f
    }

}