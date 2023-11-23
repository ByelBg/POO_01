package A_Classes_Objetos.IMC;

import A_Classes_Objetos.IMC.Pessoa;

import javax.swing.*;

public class PincipalImc1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Qtd pessoas?"));

        Pessoa pessoas[] = new Pessoa[n];

        String resultado = "";

        for(int i=0; i<n; i++){
            Pessoa p = new Pessoa();
            p.cadastra();;
            pessoas[i] = p;
            resultado += p.exibirDados();
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
