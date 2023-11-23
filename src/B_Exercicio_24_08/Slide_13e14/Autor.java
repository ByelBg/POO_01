package B_Exercicio_24_08.Slide_13e14;

import javax.swing.*;

public class Autor {
    private String nome;
    private int idade;
    private String sexo;

    // Cadastro do autor

    boolean cadastroAutor(){
        setNome(JOptionPane.showInputDialog("Insira o nome do autor"));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do autor")));
        char sex = JOptionPane.showInputDialog("Insira o sexo do autor (M/F)").toUpperCase().charAt(0);
        if(sex == "F".charAt(0)){
            setSexo("Feminino");
        }else if(sex == "M".charAt(0)){
            setSexo("Masculino");
        }else{
            setSexo("");
        }
        return validaCadastroAutor();
    }

    private boolean validaCadastroAutor(){
        String[] possuiSobrenomenome = getNome().split(" ");
        if(getNome().equals("")){
            JOptionPane.showMessageDialog(null,"Nome não pode estar em branco!");
            return false;
        }else if(possuiSobrenomenome.length <2){
            JOptionPane.showMessageDialog(null,"Autor precisa ter sobrenome");
            return false;
        }else if(getIdade() <= 0){
            JOptionPane.showMessageDialog(null,"Idade não pode ser menor ou igual a zero!");
            return false;
        }else if(getSexo().equals("")){
            JOptionPane.showMessageDialog(null,"Sexo deve ser feminino ou masculino!");
            return false;
        }else{
            return true;
        }
    }

    // Listar dados do autor

    String exibirAutor(){return "\nNome: " + getNome() + "\n" +
                                "   Sexo: " + getSexo() + "\n" +
                                "   Idade: " + getIdade();
    }

    // Gets e sets
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo.toUpperCase();
    }
    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
