import  bancos.Conta;
import javax.swing.JOptionPane;
public class Banco {
	public static void main(String[] args) {
	Conta objeto = new Conta("Gerson", 300.50, 02345, 1234);
	int op=0;
        int resposta;	
	while (op != 99) {				
        	String nome = null;
		resposta = JOptionPane.showConfirmDialog(null, "Bem-Vindo Ao Banco Dos Santos\n  " + "Movimentar ? \n Tem que acabar de fazer \n o progama");
                if (resposta == JOptionPane.YES_OPTION) {
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    op=99;
                    break;
                }
		op = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha um opção do menu abaixo: \n 1 - Depositar \n 2 - Sacar "
					+ "\n 3 - Saldo \n 4 - Sair: \n"));

		switch (op) {
			
			case 1:{
					
				JOptionPane.showMessageDialog(null, "Depositar: \n");
				objeto.depositar(100);
				break;
			}
			
			case 2:{
				
				JOptionPane.showMessageDialog(null, "Sacar: \n");
				objeto.sacar(50);
				break;
			}
			
			case 3:{
				
				objeto.saldo();
			
				break;
			}
			
			case 4:{
				
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				op=99;
				break;
				
			}
			
			}	
			
		}
			
}

}
