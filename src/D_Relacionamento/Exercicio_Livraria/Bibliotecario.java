package D_Relacionamento.Exercicio_Livraria;

import javax.swing.*;
import java.util.ArrayList;

public class Bibliotecario {
    private String nome;
    private ArrayList<Livro> livrosRespon = new ArrayList<>();

    boolean cadastraBiblio(){
        setNome(JOptionPane.showInputDialog("Insira o nome!"));
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null,"Nome inválido!");
            return false;
        }else{
            return true;
        }
    }

    void cadastraLivro(Livro livro,ArrayList<Autor> autores, Bibliotecario biblio){
        if(livro.cadastraLivro(autores, biblio)){
            livrosRespon.add(livro);
        }
    }

    //GETS E SETS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
