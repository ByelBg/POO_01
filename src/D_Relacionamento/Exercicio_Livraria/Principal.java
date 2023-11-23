package D_Relacionamento.Exercicio_Livraria;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        final Bibliotecario biblio = new Bibliotecario();
        int op;
        do {
            op = menu();
            switch (op) {
                case 1:
                    biblio.cadastraBiblio();
                    break;
                case 2:
                    Autor a = new Autor();
                    if (a.cadastraAutor()) {
                        autores.add(a);
                    }
                    break;
                case 3:
                    Livro l = new Livro();
                    biblio.cadastraLivro(l, autores, biblio);
                    livros.add(l);
                    break;
                case 4:
                    String menu1 = null;
                    for(Livro ll : livros){
                        menu1 +=ll.exibir();
                    }
                    JOptionPane.showMessageDialog(null,menu1);
                    break;
            }
        }while (op != 5) ;
    }

    public static int menu() {
        String menu = "Selecione uma opção:\n" +
                "1- Cadatrar Bibliotecário\n" +
                "2- Cadastrar Autor\n" +
                "3- Cadastrar Livro\n" +
                "4- Emprestar livro\n" +
                "5- Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}
