package bancos;
public class Conta {
	private String titular;
	private double saldo;
	private int numero;
	private int agencia;
public Conta(String titular, double saldo, int numero, int agencia ){
	this.titular=titular;
	this.saldo=saldo;
	this.numero=numero;
	this.agencia=agencia;
}
public void saldo( ){
System.out.printf("Ag: " + agencia + " Ct: " + numero + " "  + titular + " Seu saldo é %f.",saldo);
}
	
/*public void saldo( ){
System.out.println("Gerson Analista De Sistema Banco");

}*/
}
