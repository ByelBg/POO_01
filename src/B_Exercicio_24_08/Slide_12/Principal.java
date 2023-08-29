package B_Exercicio_24_08.Slide_12;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Time> times = new ArrayList<>();
        String menu = "Selecione uma opção:\n" +
                "\n1- Cadastrar time" +
                "\n2- Listar jogadores de um time" +
                "\n3- Verificar artilheiro do campeonato" +
                "\n4- Verificar qual time fez mais jogos" +
                "\n5- Sair";
        int op = 0;
        do{ op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(op == 1){
                Time t = new Time();
                t.cadastroTime();
                times.add(t);
            }
            if(op ==2){
                listaJogadores(times);
            }
            if(op == 3){
                verificarArtilheiro(times);
            }
            if(op == 4){
                verificarMaisGols(times);
            }
        }while(op !=5);
    }
    static void listaJogadores(ArrayList<Time> times){
        String pesquisa = JOptionPane.showInputDialog("Qual time?").toUpperCase();
        String result = "";
        for(Time t : times) {
            if (t.getNome().contains(pesquisa)) {
                result = t.exibirTime();
            }
        }JOptionPane.showMessageDialog(null,result);
    }
    static void verificarArtilheiro(ArrayList<Time> times){
        String result = "Melhor atilheiro do campeonato:\n";
        Jogador art = times.get(0).artilheiroTime();
        Time timeart = times.get(0);
        for(Time t : times){
            if( art.getGols() < t.artilheiroTime().getGols() ){
                art = t.artilheiroTime();
                timeart = t;
            }
        }
        result += "Time: "+timeart.getNome()+art.exibirJogador();
        JOptionPane.showMessageDialog(null, result);
    }
    static void verificarMaisGols(ArrayList<Time> times){
        String result = "Time que marcou mais gols no campeonato: ";
        Time melhorTime = times.get(0);
        for(Time t : times){
            if(melhorTime.getGolsTimes() < t.getGolsTimes()){
                melhorTime = t;
            }
        }
        result += melhorTime.getNome()+"\nQuantidade de gols: "+melhorTime.getGolsTimes();
        JOptionPane.showMessageDialog(null,result);
    }
}