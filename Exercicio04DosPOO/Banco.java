import  bancos.Conta;
public class Banco {
	public static void main(String[] args) {		
	System.out.println("Bem Vimdo Banco Dos Santos");
        Conta objeto = new Conta("Gerson", 300.50, 02345, 1234);
        objeto.saldo();	
}

}
