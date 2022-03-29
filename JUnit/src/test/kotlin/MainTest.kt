import org.junit.jupiter.api.*

class MainTest {

    @Test //para o método saber que é teste
    @DisplayName("Teste da palavra recebida") // Ajuda a saber a função por um nome melhor

    fun testePalavrarecebida(){
        Assertions.assertTrue(palavraRecebida("xxoo")) //Espera que oq saia da booleana seja true, testando ela com a condição
        Assertions.assertTrue(palavraRecebida("ooxxxxoo"))
        Assertions.assertTrue(palavraRecebida("xoxxoo")) //Vários testes
        Assertions.assertTrue(palavraRecebida("xxxooo"))
        Assertions.assertFalse(palavraRecebida("xoo")) // Executa o teste e espera que o retorno seja falso

        //Se um teste falha, os outros debaixo não são executados

        Assertions.assertAll({ //Para executar todos os testes mesmo falhando
            Assertions.assertTrue(palavraRecebida("xoxxooox")) //Vários testes
            Assertions.assertTrue(palavraRecebida("xoxxooox"))
            Assertions.assertFalse(palavraRecebida("xoxoo")) // Executa o teste e espera que o retorno seja falso
        })
    }


    @Test
    @Disabled // Desabilitado
    fun naoImplementado():Boolean{
        return true
    }

    @Test
    fun vaiFalhar90(){
        fail("Não posso terminar os testes sem esse método.") //Método vai falhar não importa o resultado

    }
    @Test
    fun naoImplementadoII(): Boolean{
        val palavra: String? = null
        return palavra!!.length == 0
        //throw NullPointerException() // Lançando exceção
    }

    @Test
    fun assumption(){
        Assumptions.assumeTrue(palavraRecebida("xxxooo")) //Roda o resto do código embaixo apenas se o assume true for true
        //////////////////////////////////////caso a condição seja false, ou seja, não ter o mesmo número de X e O, não roda embaixo
        Assertions.assertTrue(naoImplementado())
    }

    @Test
    fun exception(){
        assertThrows<NullPointerException> { naoImplementadoII() } //O método entre chaves precisa retornar a esceção pedida
        //Ele lança a nullpointer, o não implementadoII precisa dar um erro de nullpointer, caso dê, o teste é um sucesso
    }

}

