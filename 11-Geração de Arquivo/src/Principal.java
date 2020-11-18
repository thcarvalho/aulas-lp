import javax.swing.*;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        Votacao[] votacao = new Votacao[100];

        int opc = 0;
        do {
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog(
                    "VOTAÇÃO 2020\n"+
                    "ESCOLHA UMA OPÇÃO\n"+
                    "1 – Carregar Seção/Número Eleitor\n"+
                    "2 – Classificar por Seção\n"+
                    "3 – Gravar Registros\n"+
                    "4 – Mostrar Indicadores\n"+
                    "9 – Finalizar\n")
                    );
            switch (opc) {
                case 1:
                    votacao = MetodosVotacao.cadastrarVotacao();
                    break;
                case 2:
                    MetodosVotacao.classificarSecao(votacao);
                    break;
                case 3:
                    MetodosVotacao.gravarVotacao(votacao);
                    break;
                case 4:
                    Indicadores.mostrarIndicadores();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Votação Finalizada");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
                    break;
            }
        } while (opc != 9);

    }
}
