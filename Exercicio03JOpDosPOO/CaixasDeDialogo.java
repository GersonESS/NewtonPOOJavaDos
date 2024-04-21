
import javax.swing.JOptionPane;

public class CaixasDeDialogo {
 public static void main(String[] args) {
 String nome = null;
 int resposta;
 nome = JOptionPane.showInputDialog("Qual é o seu nome?");
 resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome +"?");
 if (resposta == JOptionPane.YES_OPTION) {
 // verifica se o usuário clicou no botão YES
 JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
 } else {
 JOptionPane.showMessageDialog(null, "Seu nome não é " + nome);
 }
 }
}
