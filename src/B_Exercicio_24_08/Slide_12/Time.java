package B_Exercicio_24_08.Slide_12;

import javax.swing.*;
import java.util.ArrayList;

public class Time {
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private String nome;
    private int gols;

    String menu = "Deseja cadastrar mais um jogador?\n" +
            "\n1- Sim" +
            "\n2- Não";
    void cadastroTime(){
        int op = 0;
        setNome(JOptionPane.showInputDialog("Nome do time:"));
        do{op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(op == 1){
                Jogador j = new Jogador();
                if (j.cadastroJogador()){
                    jogadores.add(j);
                }
            }
        }while(op !=2);
        artilheiroTime();
    }
    public String exibirTime(){
        String dados = "Time: "+getNome()+"\n" +
                "\nJogadores:";
        for(Jogador j : jogadores){
            dados+= j.exibirJogador();
        }
        return dados;
    }
    public Jogador artilheiroTime(){
        Jogador art = jogadores.get(0);
        for(Jogador j : jogadores){
            if(j.getGols() > art.getGols()){
                art = j;
            }
        }return art;
    }
    public int getGolsTimes(){
        int gols = 0;
        for(Jogador j : jogadores){
            gols += j.getGols();
        }return gols;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }
}
