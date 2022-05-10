public class StaticExemplo {
    static int valor = 0; // O valor pertence a classe
    int value = 0 ; // O valor também pode pertencer ao objeto

    public StaticExemplo (){
        valor++; //Como pertence a classe, vai somar somente uma vez, saída 1
        value++; // Soma todas, saída 5
    }

    public static void main(String[] args) {
        new StaticExemplo();
        new StaticExemplo();
        new StaticExemplo();
        new StaticExemplo();

        StaticExemplo sstatic = new StaticExemplo();
        System.out.println(sstatic.value); //Como ele está puxando da static, pode usar o valor
        System.out.println(StaticExemplo.valor); //Como a variável é estática, não pode ser pego pela instancia, SOMENTE PELA CLASSE DIRETO E SÓ SOMA UMA VEZ


    }
}
