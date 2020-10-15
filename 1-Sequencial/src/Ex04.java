import javax.swing.*;

public class Ex04 {
    public static void main(String[] args) {
        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano de Nascimento"));
        int anoAt = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano que nós estamos"));

        int idade = anoAt - anoNasc;
        int idade17 = idade + 17;

        JOptionPane.showMessageDialog(null, "Você tem "+idade+" anos e terá "+idade17+" daqui a 17 anos");
    }
}
