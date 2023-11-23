package C_Construtores.Exercicio_Universidade;

import javax.swing.*;
import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class Util {
    public static Aluno selecionaAluno (ArrayList<Aluno> lista){
        String menuAl = "";
        int cont = 1;
        for(Aluno a : lista) {
            menuAl += cont + " - " + a.getNome() + "\n";
            cont++;
        }
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuAl));
        return lista.get(escolha-1);
    }
    public static Disciplina selecionaDisciplina (ArrayList<Disciplina> lista){
        String menuAl = "";
        int cont = 1;
        for(Disciplina d : lista){
            menuAl += cont + " - " + d.getNome() + "\n";
            cont++;
        }
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuAl));
        return lista.get(escolha-1);
    }
}
