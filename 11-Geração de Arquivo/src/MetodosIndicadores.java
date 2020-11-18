import javax.swing.*;

public class MetodosIndicadores {
    public static void classificarPorEleitores(Votacao[] votacao) {
        int secao[] = new int[10];

        for (int i = 0; i < votacao.length; i++) {
            for (int j = 0; j < secao.length; j++) {
                if (votacao[i].numeroSecao == j) {
                    secao[j]++;
                }
            }
        }

        JOptionPane.showMessageDialog(null,
                "Seção 1: "+secao[0]+"\n"+
                "Seção 2: "+secao[1]+"\n"+
                "Seção 3: "+secao[2]+"\n"+
                "Seção 4: "+secao[3]+"\n"+
                "Seção 5: "+secao[4]+"\n"+
                "Seção 6: "+secao[5]+"\n"+
                "Seção 7: "+secao[6]+"\n"+
                "Seção 8: "+secao[7]+"\n"+
                "Seção 9: "+secao[8]+"\n"+
                "Seção 10: "+secao[9]+"\n"
        );
    }

    public static void secaoMaiorMenor(Votacao[] votacao) {
        int secao[] = new int[10];

        for (int i = 0; i < votacao.length; i++) {
            for (int j = 0; j < secao.length; j++) {
                if (votacao[i].numeroSecao == j) {
                    secao[j]++;
                }
            }
        }

        int maior = secao[0];
        int menor = secao[0];

        for (int i = 0; i < secao.length; i++) {
            if (secao[i] > maior) {
                maior = secao[i];
            } else if (secao[i] <= menor) {
                menor = secao[i];
            }
        }
        JOptionPane.showMessageDialog(null,
                "Seção com mais eleitores: "+maior+"\n"+
                "Seção com menos eleitores: "+menor
        );
    }

    public static void calcularQtdVotos(Votacao[] votacao) {
        int voto[] = new int[300];
        for (int i = 0; i < votacao.length; i++) {
            for (int j = 0; j < voto.length; j++) {
                if (votacao[i].numeroCandidato == j) {
                    voto[j]++;
                }
            }
        }

        String resultado = "Apuração\n";

        for (int i = 0; i < voto.length; i++) {
            resultado = resultado.concat("Candidato "+(i+1)+":"+voto[i]+"\n");
        }

        JOptionPane.showMessageDialog(null, ""+resultado);
    }

    public static void mostrar10MaisVotados(Votacao[] votacao) {
        int candidato[] = new int[300];
        int aux;

        for (int i = 0; i < votacao.length; i++) {
            for (int j = 0; j < candidato.length; j++) {
                if (votacao[i].numeroCandidato == j) {
                    candidato[j]++;
                }
            }
        }

        for(int i = 0; i<300; i++){
            for(int j = 0; j<299; j++){
                if(candidato[j] > candidato[j + 1]){
                    aux = candidato[j];
                    candidato[j] = candidato[j+1];
                    candidato[j+1] = aux;
                }
            }
        }

        String maisVotados = "10 candidatos mais votados:\n";

        for (int i = 0; i < 10; i++) {
            maisVotados = maisVotados.concat("Candidato "+(i+1)+":"+candidato[i+290]+"\n");
        }

        JOptionPane.showMessageDialog(null, ""+maisVotados);
    }
}
