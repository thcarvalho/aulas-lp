import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Indicadores {
    public static void mostrarIndicadores() throws IOException {
        Votacao votacao[] = new Votacao[100];

        String fileName = "Votacao2020.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        for (int i = 0; i < votacao.length; i++) {
            votacao[i] = new Votacao(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
        }

        reader.close();

        int opc = 0;
        do {
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog(
                    "INDICADORES\n"+
                            "ESCOLHA UMA OPÇÃO\n"+
                            "1 – Quantidade Eleitores por Seção\n"+
                            "2 – Seção com Maior e Menor número de Eleitores\n"+
                            "3 – Quantidade de votos por candidato\n"+
                            "4 – 10 primeiros colocadas (numero candidato. e quantidade de votos)\n"+
                            "9 – Finalizar\n")
            );
            switch (opc) {
                case 1:
                    MetodosIndicadores.classificarPorEleitores(votacao);
                    break;
                case 2:
                    MetodosIndicadores.secaoMaiorMenor(votacao);
                    break;
                case 3:
                    MetodosIndicadores.calcularQtdVotos(votacao);
                    break;
                case 4:
                    MetodosIndicadores.mostrar10MaisVotados(votacao);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Consulta finalizada");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
                    break;
            }
        } while (opc != 9);
    }
}
