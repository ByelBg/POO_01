package D_Relacionamento.Desafio_Condominio;

import javax.swing.*;
import java.util.Arrays;

public class Apartamento {
    private int numero;
    private char[] bloco;
    private double tamanhoM2;
    private double valorFixo;

    boolean cadastraAp(){
        setNumero(Integer.parseInt(JOptionPane.showInputDialog("Insira o número do Ap")));
        setBloco((JOptionPane.showInputDialog("Insira o bloco do Ap").toUpperCase()).toCharArray());
        setTamanhoM2(Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de metros quadrados")));
        setValorFixo(tamanhoM2*5);
        return validaCadastro();
    }
    boolean validaCadastro(){
        if(numero <= 0) {
            JOptionPane.showMessageDialog(null, "Numero inválido");
            return false;
        }else if(bloco == null) {
            JOptionPane.showMessageDialog(null,"Bloco inválido");
            return false;
        }else if(tamanhoM2 <= 0){
            JOptionPane.showMessageDialog(null,"Tamanho inválido");
            return false;
        }else{
            return true;
        }
    }
    String exibirAp(){
        return "Apartamento "+getNumero()+ Arrays.toString(getBloco()) +" - "+getTamanhoM2()+"m²:";
    }

    //GETS E SETS
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char[] getBloco() {
        return bloco;
    }

    public void setBloco(char[] bloco) {
        this.bloco = bloco;
    }

    public double getTamanhoM2() {
        return tamanhoM2;
    }

    public void setTamanhoM2(double tamanhoM2) {
        this.tamanhoM2 = tamanhoM2;
    }

    public double getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }
}
