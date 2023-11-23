package D_Relacionamento.Exercicio_Livraria;

import javax.swing.*;
import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Autor autor;
    private Bibliotecario biblio;

    boolean cadastraLivro(ArrayList<Autor> autores, Bibliotecario biblio){
        int cont = 1;
        int op;
        String exibir = "Selecione um:\n";
        for(Autor a : autores){
            exibir+="\n"+cont+"- "+a.getNome();
            cont++;
        }op = Integer.parseInt(JOptionPane.showInputDialog(exibir));
        setAutor(autores.get((op-1)));
        setBiblio(biblio);
        setTitulo(JOptionPane.showInputDialog("Insira o título do livro"));
        if(titulo.equals("")){
            JOptionPane.showMessageDialog(null,"Título inválido!");
            return false;
        }else{
            return true;
        }
    }

    String exibir(){
        return getTitulo()+" - "+getAutor().getNome();
    }

    //GETS E SETS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Bibliotecario getBiblio() {
        return biblio;
    }

    public void setBiblio(Bibliotecario biblio) {
        this.biblio = biblio;
    }
}
