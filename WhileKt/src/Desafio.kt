fun main() {
    var quantDemes = 0;

    //Investimento da Ana
    var investimentoAna:Float = 10000*0.05f
    var investimentoEmpresaana:Float = investimentoAna
    var investimentoSomado:Float = investimentoAna + investimentoEmpresaana
    var investimentoanaFinal: Float = investimentoSomado + (investimentoSomado * 0.02f)
    var investimentoRendidoana:Float = 0f

    //Investimento Paula
    var investimentoPaula = 10000*0.05f
    var investimentopaulaFinal:Float = investimentoPaula + (investimentoPaula * 0.08f)
    var investimentoRendidopaula:Float = 0f

    investimentoRendidopaula = investimentopaulaFinal
    investimentoRendidoana = investimentoanaFinal
    quantDemes += 1

    while (investimentoRendidopaula < investimentoRendidoana){
        investimentoRendidopaula = investimentoRendidopaula + (investimentoRendidopaula * 0.08f)
        investimentoRendidoana = investimentoRendidoana + (investimentoRendidoana* 0.08f)
        quantDemes += 1
    }

    println("O patrimônio de paula superará o de ana em $quantDemes meses")
}