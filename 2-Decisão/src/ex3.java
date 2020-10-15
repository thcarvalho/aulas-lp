import javax.swing.*;

public class ex3 {
    public static void main(String[] args) {
        double sal = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário"));
        int cod = Integer.parseInt(JOptionPane.showInputDialog(
                "Qual seu cargo?\n" +
                "Escolha uma opção:\n" +
                "1. Escrituário\n" +
                "2. Secretário\n" +
                "3. Caixa\n" +
                "4. Gerente\n"
        ));

        double aumento;
        String cargo;
        switch (cod) {
            case 1:
                cargo = "Escrituário";
                aumento = sal*0.50;
                break;
            case 2:
                cargo = "Secretário";
                aumento = sal*0.35;
                break;
            case 3:
                cargo = "Caixa";
                aumento = sal*0.20;
                break;
            case 4:
                cargo = "Gerente";
                aumento = sal*0.10;
                break;
            default:
                cargo = "Sem cargo";
                aumento = 0;
                break;
        }

        JOptionPane.showMessageDialog(null,
                "Dados:" +
                "\nCargo: "+cargo+
                "\nSalário: R$"+sal+
                "\nAumento: R$"+aumento
        );
    }
}
