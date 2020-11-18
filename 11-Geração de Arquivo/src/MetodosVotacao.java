import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MetodosVotacao {
    public static Votacao[] cadastrarVotacao() {
        Votacao[] votacao = new Votacao[100];

        for (int i = 0; i < votacao.length; i++) {
            Random random = new Random();
            votacao[i] = new Votacao(
                    random.nextInt(10),
                    random.nextInt(300)
            );
        }
        return votacao;
    }

    public static void classificarSecao(Votacao[] votacao) {
        Votacao aux;
        for(int i = 0; i<10; i++){
            for(int j = 0; j<9; j++){
                if(votacao[j].numeroSecao > votacao[j + 1].numeroSecao){
                    aux = votacao[j];
                    votacao[j] = votacao[j+1];
                    votacao[j+1] = aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Dados Cadastrados");
    }

    public static void gravarVotacao(Votacao[] votacao) throws IOException {
        String fileName = "Votacao2020.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (int i = 0; i < votacao.length; i++) {
            writer.write(Integer.toString(votacao[i].numeroSecao));
            writer.newLine();

            writer.write(Integer.toString(votacao[i].numeroCandidato));
            writer.newLine();
        }
        writer.close();
        JOptionPane.showMessageDialog(null, "Gravação Concluida");
    }

}
