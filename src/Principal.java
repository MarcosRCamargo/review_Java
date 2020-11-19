public class Principal {

    public static void main(String[] args){
        Carros c = new Carros(1);

        c.nome = "Corcel";
        c.velocidade = 0;
        Carros c2 = new Carros(10);
        c2.potencia = 10;
        c2.nome = "Corcel";
        c2.velocidade = 0;


        c.acelerar();
        c.acelerar();
        c.acelerar();

        c.frear();


        c.imprimir();
        c2.imprimir();
    }
}
