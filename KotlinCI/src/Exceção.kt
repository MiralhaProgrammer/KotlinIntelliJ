fun main() {
    try {
        val palavra: String? = null
        val numero: Int = 10/0

    } catch (e: NullPointerException){
        println("Variável nula!")
    }
    catch (e: java.lang.ArithmeticException){
        println("Variável em erro aritmético pois impossível dividir por 0")
    }catch (e: Exception){ // Se não cair em nenhum tipo de exceção antes, cai nessa, é uma genérica
        println("Generica")

    }
    finally { // É SEMPRE EXECUTADO NÃO IMPORTA O QUE ACONTEÇA, porém é opcional
        println("Finally")
    }


    println("Fim :)")
}