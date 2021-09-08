
import javax.swing.JOptionPane;
/**
 *
 * @author cmdhn
 */
public class SomaMultiplicacao {
       public static void main(String[] args) {
        // TODO code application logic here
             int num1, num2, soma, multiplicacao;
                
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        soma = num1 + num2;
        multiplicacao = num1 * num2;
        
        if (num1 == num2) {JOptionPane.showMessageDialog(null,"Resultado é uma soma "+num1+" + "+num2+" = "+soma);}
        else {JOptionPane.showMessageDialog(null,"Resultado é uma multiplicação "+num1+" * "+num2+" = "+multiplicacao);}
        System.exit(0);
    }
    
}
