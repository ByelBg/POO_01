package B_Exercicio_24_08.Slide_15e16;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int op = 0;
        String menu = "Selecione uma opção:\n" +
                "\n1- Contratar novo funcionário" +
                "\n2- Mostrar quantidade de funcionários" +
                "\n3- Sair";
        do{op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(op == 1){
                // Contratar funcionário
                Funcionario f = new Funcionario();
                f.contratar();
            }else if(op == 2){
                // Listar quantidade
                Funcionario f = new Funcionario();
                JOptionPane.showMessageDialog(null,"Total de funcionários cadastrados: "+f.getTotalFuncionarios());
            }
        }while(op!=3);
    }
}
