package B_Exercicio_24_08.Slide_15e16;

import javax.swing.*;

/*
Crie uma classe chamada "Funcionario" com os seguintes atributos estáticos:
● Um atributo inteiro chamado "totalFuncionarios" que armazena o número
total de funcionários da empresa.
● Um atributo inteiro chamado "idadeMinima" que representa a idade mínima
permitida para contratação.
A classe "Funcionario" deve ter os seguintes métodos estáticos:
● Um método chamado "getTotalFuncionarios" que retorna o número total de
funcionários.
● Um método chamado "getIdadeMinima" que retorna a idade mínima
permitida para contratação.
● Um método chamado "contratar" que recebe como parâmetros o nome e a
idade de um funcionário, e verifica se a idade é maior ou igual à idade
mínima permitida. Se for, o método deve incrementar o contador de total de
funcionários e exibir uma mensagem de sucesso na contratação. Caso
contrário, o método deve exibir uma mensagem informando que o
funcionário não pode ser contratado devido à idade.
Requisitos: Exibir o número total de funcionários atualmente na empresa e
contratar funcionários com nomes e idades diferentes.
 */
public class Funcionario {
    static int totalFuncionarios = 0;
    static int idadeMinima = 18;
    int getTotalFuncionarios(){
        return totalFuncionarios;
    }
    static int getIdadeMinima(){
        return idadeMinima;
    }
    private static String nome;
    private static int idade;

    boolean contratar(){
        nome = JOptionPane.showInputDialog("Insira o nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));;
        if(idade < getIdadeMinima()){
            JOptionPane.showMessageDialog(null, "Funcionário não pode ser contratado devido à idade");
            return false;
        }else if(idade >= getIdadeMinima()){
            JOptionPane.showMessageDialog(null,"Funcionario cadastrado");
            totalFuncionarios++;
            return true;
        }
        return false;
    }
}