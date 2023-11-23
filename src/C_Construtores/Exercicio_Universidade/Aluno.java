package C_Construtores.Exercicio_Universidade;

import javax.swing.*;
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Disciplina> discMatriculadas = new ArrayList<>();
    private ArrayList<Nota> notas = new ArrayList<>();

    boolean cadastroAluno(){
        setNome(JOptionPane.showInputDialog("Insira o nome!"));
        return validaCadastroAluno();

    }
    private boolean validaCadastroAluno(){
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null,"Nome inválido!");
            return false;
        }else{
            return true;
        }
    }
    String exibirNotas(){
        String result = "";
        for(Nota n : notas){
            result +=n.exibirNotas();
        }
        return result;
    }

    //Gets e sets
    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDiscMatriculadas() {
        return discMatriculadas;
    }

    public void setDiscMatriculadas(ArrayList<Disciplina> discMatriculadas) {
        this.discMatriculadas = discMatriculadas;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
}
