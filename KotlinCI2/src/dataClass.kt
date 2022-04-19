import java.text.Normalizer.Form

fun main() {

    val f1: Forma = Forma (10,8)
    val f2: Forma = Forma(10,8)

    var fd3:FormaData = FormaData(20,30) //Data Class resolve toda a burocracia da class
    var fd4:FormaData = FormaData(20,30)

    println(fd3.equals(fd4))
    println(fd3.toString())
    println(fd3.hashCode())
    println(fd4.toString())
    println(fd4.hashCode())

    println(f1.equals(f2))//Se f1 é igual a f2, compara os endereços de memória, que são diferentes
    println(f1.toString())
    println(f1.hashCode())
    println(".......................")
    println(f2.toString())
    println(f2.hashCode())

    fd3 = fd4.copy(50) //Valor de fd4 vai para o fd3, porém com 50 no a

}
class Forma(val a: Int, val b:Int){
    override fun equals(other: Any?): Boolean {

        return if(other is Forma){
            (other.a == this.a && other.b == this.b)
        }else {
            false
        } //Sobrescreve o metodo equals para caso O OUTRO B seja igual a esse B, ou seja, se o B do equals f2 é igual ao B do equals F1 e vice versa.
    }
}

data class FormaData(val a:Int, val b:Int) //Data class traz funcionalidades quando precisamos de tostring, equals ou hashCode
