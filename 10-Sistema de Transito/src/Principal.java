import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Estatistica[] estatisticas = new Estatistica[10];
        int opc;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU ESTATISTICA\n" +
                    "Estatisticas de acidentes em 2019\n" +
                    "1. Cadastro de Estatistica\n" +
                    "2. Consulta por quantidade de acidentes\n" +
                    "3. Consulta por estatistica de acidentes\n" +
                    "4. Acidentes acima da média de 10 cidades\n" +
                    "9. Finalizar"));

            switch (opc) {
                case 1:
                    estatisticas = Metodos.cadastrarEstatistica();
                    break;
                case 2:
                    Metodos.consultarAcidentes(estatisticas);
                    break;
                case 3:
                    Metodos.consultarMaiorMenor(estatisticas);
                    break;
                case 4:
                    Metodos.calcularAcimaMedia(estatisticas);
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida");
                    break;
            }
        } while (opc != 9);
    }
}
