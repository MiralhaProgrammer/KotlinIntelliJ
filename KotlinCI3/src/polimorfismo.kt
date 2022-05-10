interface Funcionarios {
    var salarioo: Float
    fun bonus(): Float
}

class Gerente (override var salarioo: Float) : Funcionarios{ //Interface sobrescreve o salario e o bonus para funcionar,
    //Já que não foram definidos anteriormente

    override fun bonus(): Float {
        return salarioo * 0.5f
    }

}
class Analista (override var salarioo: Float) : Funcionarios {
    override fun bonus(): Float {
        return salarioo * 0.3f
    }
}
fun mostraBonus (f: Funcionarios) {//A variável f é do tipo funcionário, porém recebe qualquer instancia que herda,
    // O funcionário se comporta de formas diferentes de acordo com o parametro que recebe, verificar na linha 26-27
    //Isso é polimorfismo, uma mesma classe se comportando de formas distintas através de suas heranças
    println(f.bonus()) //Mostra bonus do gerente
}


fun main() {
    mostraBonus(Gerente(3000f))
    mostraBonus(Analista(2000f))
}