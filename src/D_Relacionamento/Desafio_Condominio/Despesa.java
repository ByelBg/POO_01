package D_Relacionamento.Desafio_Condominio;

import javax.swing.*;

public class Despesa {
    private String nome;
    private int ano;
    private int mes;
    private double valor;

    boolean cadastraDespesa(){
        setNome(JOptionPane.showInputDialog("Informe o nome da despesa"));
        setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da despesa")));
        setMes(Integer.parseInt(JOptionPane.showInputDialog("Informe o mês da despesa (1~12)")));
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da despesa")));
        return validaCadastro();
    }
    boolean validaCadastro(){
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null,"Nome inválido!");
            return false;
        }else if(ano <=0) {
            JOptionPane.showMessageDialog(null, "Ano inválido!");
            return false;
        }else if(mes <=0 || mes > 12){
            JOptionPane.showMessageDialog(null,"Mês inválido!");
            return false;
        }else if(valor <= 0){
            JOptionPane.showMessageDialog(null,"Valor inválido!");
        }return true;
    }
    //GETS E SETS
    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
