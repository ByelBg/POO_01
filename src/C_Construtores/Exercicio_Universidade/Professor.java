package C_Construtores.Exercicio_Universidade;

import javax.swing.*;

public class Professor {
    public Professor(){
        cadastroProfessor();
    }
    private String nome;
    private int formacao;
    private String formacaoExtenso;
    int aux = 0;

    private boolean cadastroProfessor(){
        setNome(JOptionPane.showInputDialog("Insira o nome do professor!"));
        aux = Integer.parseInt(JOptionPane.showInputDialog("Insira a formação do professor:\n" +
                "\n1- Graduação" +
                "\n2- Especialização" +
                "\n3- Pós-Graduação"));
        if(aux == 1){
            setFormacao(1);
            setFormacaoExtenso("Graduação");
        }else if(aux ==2){
            setFormacao(2);
            setFormacaoExtenso("Especialiação");
        }else if(aux ==3){
            setFormacao(3);
            setFormacaoExtenso("Pós-Graduação");
        }
        return validaCadastroProfessor();
    }
    private boolean validaCadastroProfessor(){
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null,"Precisa inserir nome!");
            return false;
        }else if(aux<1 || aux>3){
            JOptionPane.showMessageDialog(null,"Insira uma formação válida!");
            return false;
        }else{
            return true;
        }
    }

    String exibirProfessor(){
        return ""+getNome()+" - Grau de formação: "+formacaoExtenso+"\n";
    }

    //Gets e sets
    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFormacao() {
        return formacao;
    }

    public void setFormacao(int formacao) {
        this.formacao = formacao;
    }

    public String getFormacaoExtenso() {
        return formacaoExtenso;
    }

    public void setFormacaoExtenso(String formacaoExtenso) {
        this.formacaoExtenso = formacaoExtenso;
    }
}
