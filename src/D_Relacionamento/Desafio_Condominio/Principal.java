package D_Relacionamento.Desafio_Condominio;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Apartamento> aps = new ArrayList<>();
        ArrayList<Despesa> despesas = new ArrayList<>();
        int op;
        do{op = menu();
            switch (op){
                case 1:
                    Apartamento a = new Apartamento();
                    if(a.cadastraAp()){
                        aps.add(a);
                    }
                    break;
                case 2:
                    Despesa d = new Despesa();
                    if(d.cadastraDespesa()){
                        despesas.add(d);
                    }
                    break;
                case 3:
                    listaDespesasGeral(aps, despesas);
                    break;
                case 4:
                    listaDespesasAp(aps, despesas);
                    break;
            }
        }while(op != 5);
    }
    public static int menu() {
        String menu = "Selecione uma opção:\n" +
                "1- Cadatrar Apartamentos\n" +
                "2- Cadastrar Despesas\n" +
                "3- Listar Despesas\n" +
                "4- Despesa por Apartamento\n" +
                "5- Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
    static void listaDespesasGeral(ArrayList<Apartamento> aps, ArrayList<Despesa> desps) {
        DecimalFormat rs = new DecimalFormat("###,###.00");
        String result = "Listagem de despesas:\n";
        double despesas = 0;
        int opAno; int opMes;
        opAno = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano"));
        opMes = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês"));
        for(Despesa d : desps){
            if(d.getAno() == opAno && d.getMes() == opMes){
                for (Despesa d2 : desps) {
                    despesas += d2.getValor();
                }despesas = despesas/aps.size();
            }
        }for(Apartamento a : aps){
            double despesaTotal = a.getValorFixo()+despesas;
            result += a.exibirAp()+"\n     R$"+rs.format(despesaTotal)+"\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }

    static void listaDespesasAp(ArrayList<Apartamento> aps, ArrayList<Despesa> desps){
        DecimalFormat rs = new DecimalFormat("###,###.00");
        String result = "Listagem de despesas:\n";
        double despesas = 0;
        int opAno; int opMes; int opAp;
        opAno = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano"));
        opMes = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês"));
        opAp = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do apartamento"));
        for(Despesa d : desps){
            if(d.getAno() == opAno && d.getMes() == opMes){
                for (Despesa d2 : desps) {
                    despesas += d2.getValor();
                }despesas = despesas/aps.size();
            }
        }for(Apartamento a : aps){
            if(a.getNumero() == opAp){
                double despesaTotal = a.getValorFixo()+despesas;
                result += a.exibirAp()+"\n     Condomínio: R$"+rs.format(a.getValorFixo())+"" +
                        "\n     Despesas: R$"+rs.format(despesas)+"" +
                        "\n     Total: R$"+rs.format(despesaTotal);
            }
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
