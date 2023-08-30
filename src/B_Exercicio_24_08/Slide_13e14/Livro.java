package B_Exercicio_24_08.Slide_13e14;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Livro {
    DecimalFormat rs = new DecimalFormat("###,###.00");
    private String titulo;
    private double preco;
    private ArrayList<Autor> autoresLivro = new ArrayList<>();
    String menu = "Deseja cadastrar mais um autor?\n" +
            "\n1- Sim" +
            "\n2- Não";

    // Cadastrar Livros

    boolean cadastroLivro(){
        int op = 0;
        setTitulo(JOptionPane.showInputDialog("Insira o título do Livro"));
        setPreco(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do livro")));
        do{op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(op == 1){
                Autor a = new Autor();
                if(a.cadastroAutor()){
                    autoresLivro.add(a);
                }
            }
        }while(op!=2);
        return validaCadastroLivro();
    }

    boolean validaCadastroLivro(){
        int qtdAutores = 0;
        for(Autor a : autoresLivro){
            qtdAutores++;
        }
        if(getTitulo().equals("")){
            JOptionPane.showMessageDialog(null,"Título não pode estar em branco!");
            return false;
        }else if(getPreco() <=0) {
            JOptionPane.showMessageDialog(null, "Preço não pode ser igual ou inferior a zero!");
            return false;
        }else if(qtdAutores>4){
            JOptionPane.showMessageDialog(null,"Livro deve posssuir entre 1 e 4 autores!");
            return false;
        }else{
            return true;
        }
    }

    // Listar dados do Livro

    String exibirLivro(){
        String dados ="\nTítulo: "+getTitulo()+"\n" +
                "   Preço: R$"+rs.format(getPreco())+"\n" +
                "   Autores:   ";
        for(Autor a : autoresLivro){
            dados+=a.exibirAutor()+"   ";
        }
        return dados;
    }


    // Gets e sets
    public String getTitulo() {
        return titulo.toLowerCase();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Autor> getAutoresLivro() {
        return autoresLivro;
    }

    public void setAutoresLivro(ArrayList<Autor> autores) {
        this.autoresLivro = autores;
    }
}
