package carros;
public class Carro {
 //Atributos
    public String nome;
    public String marca;
    public int ano;
    public int vel;
// construtores padrao
    public Carro() {

    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public Carro(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public Carro(String nome, String marca, int vel) {
        this.nome = nome;
        this.marca = marca;
        this.vel = vel;
    }
// metodos
public void acelerar(int aceleracao) {
        vel += aceleracao;
    }

public    void freiar(int reduzir) {
        vel -= reduzir;
    }

    void buzinar() {
        System.out.println("bibibib");
        System.out.println("A velocidade é " + vel + "KM/H");
    }

}

