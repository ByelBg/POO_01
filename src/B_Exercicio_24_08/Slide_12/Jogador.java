package B_Exercicio_24_08.Slide_12;

import javax.swing.*;

public class Jogador {
    private String nome;
    private int camisa;
    private int gols;

    // Gets e sets
    public String getNome() {
        return nome.toUpperCase();
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    // Cadastro

    boolean cadastroJogador(){
        setNome(JOptionPane.showInputDialog("Nome:"));
        setCamisa(Integer.parseInt(JOptionPane.showInputDialog("Camisa:")));
        setGols(Integer.parseInt(JOptionPane.showInputDialog("Gols:")));
        return validaCadastroJogador();
    }
    boolean validaCadastroJogador(){

        if(nome.equals("")){
            JOptionPane.showMessageDialog(null,"Precisa de um nome!");
            return false;
        }if (camisa <= 0 || camisa > 99){
            JOptionPane.showMessageDialog(null, "Número da camisa Inválido");
            return false;
        }if (gols < 0){
            JOptionPane.showMessageDialog(null,"Impossível marcar gols negativos!");
            return false;
        }
        return true;
    }
    // Listar Jogador
    String exibirJogador(){
        return "\nNome: "+nome+"\n   Camisa: "+camisa+"\n   Gols marcados: "+gols+"\n";
    }
}
