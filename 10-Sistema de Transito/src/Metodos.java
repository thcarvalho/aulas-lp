import javax.swing.*;

public class Metodos {

    public static Estatistica[] cadastrarEstatistica(){
        Estatistica[] estatistica = new Estatistica[10];

        for (int i = 0; i < 10; i++) {
            estatistica[i] = new Estatistica(
                    Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo da cidade " + (i+1))),
                    JOptionPane.showInputDialog("Informe o nome da cidade " + (i+1)),
                    Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de acidentes " + (i+1)))
            );
        }

        return estatistica;
    }

    public static void consultarAcidentes(Estatistica[] estatisticas) {
        for (int i = 0; i < 10; i++) {
            if (estatisticas[i].qtdAcidentes > 100 && estatisticas[i].qtdAcidentes < 500) {
                JOptionPane.showMessageDialog(null, "Cidade: "+estatisticas[i].nomeCidade+"\nQuantidade: "+estatisticas[i].qtdAcidentes);
            }
        }
    }

    public static void consultarMaiorMenor(Estatistica[] estatisticas) {
        Estatistica aux;
        for(int i = 0; i<10; i++){
            for(int j = 0; j<9; j++){
                if(estatisticas[j].qtdAcidentes > estatisticas[j + 1].qtdAcidentes){
                    aux = estatisticas[j];
                    estatisticas[j] = estatisticas[j+1];
                    estatisticas[j+1] = aux;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, "Cidade: "+estatisticas[i].nomeCidade+"\nQuantidade: "+estatisticas[i].qtdAcidentes);
        }
    }

    public static void calcularAcimaMedia(Estatistica[] estatisticas) {
        int somaQtd = 0;
        int mediaQtd = 0;

        for (int i = 0; i < 10; i++) {
            somaQtd+=estatisticas[i].qtdAcidentes;
        }
        mediaQtd = somaQtd/10;

        for (int i = 0; i < 10; i++) {
            if (estatisticas[i].qtdAcidentes > mediaQtd) {
                JOptionPane.showMessageDialog(null, "Cidade: "+estatisticas[i].nomeCidade+"\nQuantidade: "+estatisticas[i].qtdAcidentes);
            }
        }
    }

}
