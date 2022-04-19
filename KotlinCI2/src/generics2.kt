fun main() {
    println(generics("22 anos", 5,6,7,8))
}

fun <g> generics (idaderandon: g, vararg diadasemana: Int){
    println("$idaderandon, ${diadasemana[0]}")

}