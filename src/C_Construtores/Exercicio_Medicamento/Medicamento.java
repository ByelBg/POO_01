package C_Construtores.Exercicio_Medicamento;

public class Medicamento {
    private String nome;
    private enum Adm{
        INJETAVEL(1), TOPICO(2), ORAL(3);

        public int valorAdm;
        Adm (int valor){
            valorAdm = valor;
        }
    }
}
