package B_Exercicio_24_08.Slide_13e14;

import javax.swing.*;
import java.beans.PropertyEditorSupport;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.jar.JarOutputStream;

/*
EXERCÍCIO
Faça um programa que permita cadastrar livros em memória (utilizar ArrayList).
Cada livro possui titulo, preço e autores (no mínimo 1 e no máximo 4 autores).
Cada autor tem nome, sexo e idade.
Crie as classes com os atributos e métodos necessários para atender aos
seguintes requisitos:
Cadastrar Autores e Livros, listar todos os livros cadastrados (todos os dados
do livro, inclusive os autores com todos os dados), pesquisar por autor (listar
todos os livros de um autor), pesquisar por faixa de valor do livro (mínimo e
máximo), listar todos os livros cujo autores tenham crianças (idade <=12), listar
todos os livros que foram escritos apenas por mulheres ou por homens (o
usuário informa qual sexo deseja realizar a consulta).

REGRAS:
O título do livro, deve ser exibido sempre em minúsculo (mesmo que o usuário
faça o cadastro maiúsculo).
Não permitir cadastro de valores menores ou iguais a ZERO.
Ao cadastrar o autor, permitir apenas cadastro com nome e sobrenome (duas
palavras).
Ao exibir o valor, mostrar o símbolo da moeda na frente (R$)
A idade do autor não pode ser negativa ou zero
 O sexo obrigatoriamente deve ser Masculino ou Feminino. (Enum)
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
        String menu = "Selecione uma opção:\n" +
                "\n1- Cadastrar livro" +
                "\n2- Pesquisar por autor" +
                "\n3- Pesquisar por faixa de valor do livro" +
                "\n4- Listar todos os livros cujos autores tenham crianças" +
                "\n5- Listar livros escritos apenas por mulheres ou por homens" +
                "\n6- Sair";
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {
                Livro l = new Livro();
                if (l.cadastroLivro()) {
                    livros.add(l);
                    for (Autor a : l.getAutoresLivro()) {
                        autores.add(a);
                    }
                }
            }
            if (op == 2) {
                procurarAutor(autores, livros);
            }
            if (op == 3) {
                procurarPorPreco(livros);
            }
            if (op == 4) {
                procurarAutorCrianca(autores, livros);
            }
            if (op == 5) {
                procurarAutorHomemMulher(livros);
            }
        } while (op != 6);
    }

    static void procurarAutor(ArrayList<Autor> autores, ArrayList<Livro> livros) {
        String pesquisa = "";
        Autor autorBusca;
        String result = "Resultado da pesquisa:\n";
        pesquisa = JOptionPane.showInputDialog("Insira o autor que deseja buscar:").toUpperCase();
        for (Autor a : autores) {
            if (a.getNome().contains(pesquisa)) {
                autorBusca = a;
                for (Livro l : livros) {
                    if (l.getAutoresLivro().contains(autorBusca)) {
                        result += l.exibirLivro();
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, result);
    }

    static void procurarPorPreco(ArrayList<Livro> livros) {
        DecimalFormat rs = new DecimalFormat("###,###.00");
        double precoMin = Double.parseDouble(JOptionPane.showInputDialog("Defina o preço mínimo para pesquisa:"));
        double precoMax = Double.parseDouble(JOptionPane.showInputDialog("Defina o preço máximo para pesquisa:"));
        String result = "Lista de livros de R$" + rs.format(precoMin) + " até R$" + rs.format(precoMax) + ":\n";
        for (Livro l : livros) {
            if (l.getPreco() <= precoMax && l.getPreco() >= precoMin) {
                result += l.exibirLivro();
            }
        }
        JOptionPane.showMessageDialog(null, result);
    }

    static void procurarAutorCrianca(ArrayList<Autor> autores, ArrayList<Livro> livros) {
        Autor autorBusca;
        String result = "Lista de livros que possuem autores crianças: (Menores de 12 anos)\n";
        for (Autor a : autores) {
            if (a.getIdade() <= 12) {
                autorBusca = a;
                for (Livro l : livros) {
                    if (l.getAutoresLivro().contains(autorBusca)) {
                        result += l.exibirLivro();
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, result);
    }

    static void procurarAutorHomemMulher(ArrayList<Livro> livros) {
        String buscaSexo = null;
        String result = null;
        char busca = JOptionPane.showInputDialog("Listar por homens ou mulheres? (M/F)").toUpperCase().charAt(0);
        while (busca != "M".charAt(0) && busca != "F".charAt(0)) {
            busca = JOptionPane.showInputDialog("Opção inválida!" +
                    "\nListar por homens ou mulheres? (M/F)").toUpperCase().charAt(0);
        }
        if (busca == "M".charAt(0)) {
            buscaSexo = "Masculino";
            result = "Lista de livros que todos os autores são homens:\n";
        } else if (busca == "F".charAt(0)) {
            buscaSexo = "Feminino";
            result = "Lista de livros que todas as autoras são mulheres:\n";
        }
        for (Livro l : livros) {
            int valida = l.getAutoresLivro().toArray().length;;
            for (Autor a : l.getAutoresLivro()) {
                if (a.getSexo().equalsIgnoreCase(buscaSexo)) {
                    valida--;
                }
            }
            if (valida == 0) {
                result += l.exibirLivro();
            }
        }
        JOptionPane.showMessageDialog(null, result);
    }
}