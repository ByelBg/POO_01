package A_Classes_Objetos.Exercicio_Carro;

import javax.swing.*;

public class Carro {

    String marca;
    String modelo;
    String cor;

    int anoFabric;

    boolean cadastro(){
        marca = JOptionPane.showInputDialog("Insira a marca do seu carro");
        modelo = JOptionPane.showInputDialog("Insira o modelo do carro");
        anoFabric = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de fabricação"));
        cor = JOptionPane.showInputDialog("Insira a cor do veículo");
        return validaCadastro();
    }

    boolean validaCadastro(){
        if(marca.equals("")){
        JOptionPane.showMessageDialog(null,"Marca é obrigatório");
        return false;
        }
        if(cor.equals("")){
            JOptionPane.showMessageDialog(null,"Cor é obrigatório");
            return false;
        }
        if(anoFabric < 1954 || anoFabric > 2023){
            JOptionPane.showMessageDialog(null,"Ano inválido");
            return false;
        }
        return true;
    }

    String exibirDados(){
        return "Marca: "+marca+" | Modelo: "+modelo+" | Ano Fabricação: "+anoFabric+" | Cor: "+cor+"\n";
    }
}
