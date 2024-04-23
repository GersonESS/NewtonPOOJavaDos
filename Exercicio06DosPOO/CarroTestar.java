import  carros.Carro;
/** 
 * @author Gerson
 * 
*/
public class CarroTestar {
    public static void main(String[] args) {
	//System.out.println("Bem Vimdo A Frota Dos Santos");
        Carro c1 = new Carro();
        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 60;
        System.out.println("A velocidade é " + c1.vel + "KM/H");
        c1.acelerar(10);
        System.out.println("A velocidade é " + c1.vel + "KM/H");
        System.out.println("nome: " + c1.nome + " Marca: " + c1.marca + " Vel: " + c1.vel);
        c1.freiar(30);
        System.out.println("A velocidade é " + c1.vel + "KM/H");
        Carro c2 = new Carro("Santana", "VW  ");
        c2.vel = 15;
        System.out.println("nome: " + c2.nome + " Marca: " + c2.marca + " Vel: " + c2.vel);
        Carro c3 = new Carro("Ferrari", "FORD", 90);
        System.out.println("nome: " + c3.nome + " Marca: " + c3.marca + " Vel: " + c3.vel);
	
    }
}

