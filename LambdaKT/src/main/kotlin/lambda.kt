fun main() {

    chamarLambdaA(lambdaA)
    chamarLambdaB(lambdaB)
    chamarLambdaSemVal { x: Int, y: Int, z: Int -> x + y }

}

fun chamarLambdaA(lambda: () -> Unit) {
    lambda()
}

fun chamarLambdaB(lambdaB: (a: Int, b: Int) -> Int) {}
fun chamarLambdaSemVal(lambdaC: (x: Int, y: Int, z: Int) -> Int) {}

val lambdaA = { println("Lambda A :)") }

val lambdaB = { a: Int, b: Int ->
    println("Contando")
    a + b
}