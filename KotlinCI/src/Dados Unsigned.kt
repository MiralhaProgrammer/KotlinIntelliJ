fun main() { //Numeros que perdem a parte do número negativo, por exemplo polegadas de uma televisão
    println("Ulong MAX - ${ULong.MAX_VALUE} - Min ${ULong.MIN_VALUE}")
    println ("Uint Max - ${UInt.MAX_VALUE} - Min ${UInt.MIN_VALUE}")
    println("Ushort MAX - ${UShort.MAX_VALUE} - Min ${UShort.MIN_VALUE}")
    println("UByte MIN - ${UByte.MAX_VALUE} - Min ${UByte.MIN_VALUE}")

    var abc: UInt = 2u // Colocar sempre o U para indicar numeros Unsigned
    println(abc)

    // val = valor nunca muda
    // var = valor muda
}