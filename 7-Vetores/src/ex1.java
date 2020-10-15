import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {
        double preco[], qtd[], tot_vend, tot_geral, comissao;

        qtd = new double[5];
        preco = new double[5];
        tot_geral = 0;

        for (int i = 0; i <= 4; i++) {
            qtd[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida do "+(i+1)+"o produto"));
            preco[i] = Double.parseDouble((JOptionPane.showInputDialog("Digite o preço do "+(i+1)+"o produto")));
        }

        for (int i = 0; i <= 4; i++){
            tot_vend = qtd[i] * preco[i];
            JOptionPane.showMessageDialog(null,
                    "Quantidade vendida do " + (i+1) + "o produto: " + qtd[i] + " Valor do " + (i+1) + "o produto: " + preco[i] + " Total geral da venda: " + tot_vend);
            tot_geral += tot_vend;
        }

        comissao = tot_geral*0.05;
        JOptionPane.showMessageDialog(null, "Valor das vendas: "+tot_geral+"\nValor da Comissão: "+comissao);
    }
}
