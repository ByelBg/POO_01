package A_Classes_Objetos.Exercicio_Carro;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PrincipalCarro {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        String menu = "Selecione uma opção\n" +
                "\n1- Cadastrar novo carro" +
                "\n2- Listar por ano de fabricação" +
                "\n3- Listar por marca" +
                "\n4- Ordenar por cor" +
                "\n5- Sair";
        int op = 0;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(op == 1){
                //Cadastro
                //Criação do objeto carro, puxando as variáveis dele da Classe Carro
                Carro c = new Carro();
                //Aqui ele valida se é válido ou não, caso seja ele adiciona no ArrayList
                if(c.cadastro()){
                    carros.add(c);
                }
            }
            if(op == 2){
                int anoInic = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano inicial"));
                int anoFim = Integer.parseInt(JOptionPane.showInputDialog("Insira o dano final"));
                String result = "Lista de carros do ano "+anoInic+" até o ano "+anoFim+"\n\n";
                for(Carro c : carros) {
                    if (c.anoFabric >= anoInic && c.anoFabric <= anoFim) {
                        result += c.exibirDados();
                    }
                }
            }
            if(op == 3){
                String marcaSolic = JOptionPane.showInputDialog("Insira a marca que você quer listar").toUpperCase();
                String result = "Lista de carros da marca "+marcaSolic+"\n\n";
                for(Carro c : carros){
                    if(c.marca.toUpperCase().equals(marcaSolic)){
                        result += c.exibirDados();
                    }
                }JOptionPane.showMessageDialog(null, result);
            }
            if(op == 4){
                JOptionPane.showMessageDialog(null,"WIP");
            }
        }while(op !=5);
    }
}
