package C_Construtores.Exercicio_Universidade;

import javax.swing.*;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private int op = 0;
    private Professor professor;

    boolean cadastroDisciplina(ArrayList<Professor> professores){
        if(professores.size() == 0){
            JOptionPane.showMessageDialog(null,"Sem professores cadastrados!");
            return false;
        }
        int cont = 0;
        String menu = "Lista de professores: \n";
        setNome(JOptionPane.showInputDialog("Insira o nome da disciplina!"));
        setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Insira a carga horária")));
        for(Professor p : professores){
            cont++;
            menu+=cont+"- "+p.exibirProfessor();
        }
        op = Integer.parseInt(JOptionPane.showInputDialog(menu))-1;
        setProfessor(professores.get(op));
        return validaCadastroDisciplina(professores);
    }

    private boolean validaCadastroDisciplina(ArrayList<Professor> professores) {
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null,"Insira um nome!");
            return false;
        }else if(cargaHoraria<=0) {
            JOptionPane.showMessageDialog(null, "Insira uma carga horária válida!");
            return false;
        }else if(op>professores.size()){
            JOptionPane.showMessageDialog(null,"Professor inválido!");
            return false;
        }else{
            return true;
        }
    }

    String exibirDisc(){
        return "Disciplina: "+getNome()+"("+getCargaHoraria()+" Horas - Prof: "+professor.getNome()+")\n";
    }

    //Gets e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
