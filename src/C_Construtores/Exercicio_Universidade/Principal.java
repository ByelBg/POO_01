package C_Construtores.Exercicio_Universidade;

import javax.swing.*;
import java.util.ArrayList;

/*
Uma disciplina possui um nome, carga horária e é lecionada por um professor.
Um professor tem nome e formação (1 - graduação, 2 - especialização, 3 - pós
graduação)
Cada aluno possui nome, a lista de disciplinas em que está matriculado e as
notas de três avaliações para cada disciplina.
Faça um programa que possibilite: Cadastrar professores, alunos e disciplinas.
Realizar matrículas. Informar as notas dos alunos. Listar as disciplinas de um
aluno com a média obtida por ele. Listar as disciplinas que são lecionadas por
professores com pós graduação
 */
public class Principal {
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Professor> professores = new ArrayList<>();
    private static ArrayList<Disciplina> discs = new ArrayList<>();
    public static void main(String[] args) {
        int op;
        do {
            op = menu();
            switch (op) {
                case 1:
                    professores.add(new Professor());
                    break;
                case 2:
                    Disciplina d = new Disciplina();
                    if(d.cadastroDisciplina(professores)){
                        discs.add(d);
                    }
                    break;
                case 3:
                    Aluno a = new Aluno();
                    if(a.cadastroAluno()){
                        alunos.add(a);
                    }
                    break;
                case 4:
                    matricula();
                    break;
                case 5:
                    informarNota();
                    break;
                case 6:
                    listarNotas();
                    break;
                case 7:
                    listarGraduacao(professores);
                    break;
            }
        }while(op != 8);
    }
    public static int menu() {
        String menu = "1 - Cadastrar Professores\n"
                + "2 - Cadastrar Disciplinas\n"
                + "3 - Cadastrar Alunos\n"
                + "4 - Realizar Matrícula\n"
                + "5 - Informar Nota\n"
                + "6 - Listar Média\n"
                + "7 - Professores com Pós-Graduação\n"
                + "8 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    public static void matricula() {
        Aluno a = Util.selecionaAluno(alunos);
        if (a.getDiscMatriculadas().size() > 3) {
            JOptionPane.showMessageDialog(null, "Aluno cadastrado no máximo de matérias!");
        } else {
            Disciplina d = Util.selecionaDisciplina(discs);
            a.getDiscMatriculadas().add(d);
        }
    }
    public static void informarNota() {
        Aluno a = Util.selecionaAluno(alunos);
        Disciplina d =  Util.selecionaDisciplina(a.getDiscMatriculadas());
        Nota n = new Nota();
        n.setDisc(d);
        n.setN1(Double.parseDouble(JOptionPane.showInputDialog("Nota 1")));
        n.setN2(Double.parseDouble(JOptionPane.showInputDialog("Nota 2")));
        n.setN3(Double.parseDouble(JOptionPane.showInputDialog("Nota 3")));
        a.getNotas().add(n);

    }
    public static void listarNotas(){
        Aluno a = Util.selecionaAluno(alunos);
        String result = "Disciplinas e médias: \n"+a.exibirNotas();
        JOptionPane.showMessageDialog(null,result);
    }
    public static void listarGraduacao(ArrayList<Professor> professores){
        String exibir = "Matérias:\n";
        for(Professor p : professores){
            if(p.getFormacao() == 3){
                exibir += "\n"+p.exibirProfessor();
            }
        }
        JOptionPane.showMessageDialog(null,exibir);
    }
}
