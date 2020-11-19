public class Carros {
    int potencia;
    int velocidade;
    String nome;
    Carros(int potencia){
        this.potencia = potencia;
        velocidade = 0;
    }
    void acelerar(){
        velocidade += potencia;
    }

    void frear(){
        velocidade = velocidade/2;
    }
    int getVelocidade(){
        return velocidade;
    }
    void imprimir(){
        System.out.println("O carro"+nome+" esta a velocidade de "+getVelocidade()+" km/h");
    }
}
