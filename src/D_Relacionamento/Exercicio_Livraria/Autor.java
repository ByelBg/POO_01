package D_Relacionamento.Exercicio_Livraria;

import javax.swing.*;
import java.util.ArrayList;

public class Autor {
    private String nome;
    private ArrayList<Livro> livros = new ArrayList<>();

    public boolean cadastraAutor(){
        setNome(JOptionPane.showInputDialog("Insira o nome:"));
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null,"Nome inválido!");
            return false;
        }
        return true;
    }

    //GETS E SETS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
}
