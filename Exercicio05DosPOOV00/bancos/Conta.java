package bancos;
import javax.swing.JOptionPane;
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
JOptionPane.showMessageDialog(null, "Ag: " + agencia + " Ct: " + numero + " "  + titular + " Seu saldo é : " + saldo);
        	
}
			
}
