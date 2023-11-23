package C_Construtores.Exercicio_Universidade;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Nota {
    DecimalFormat df = new DecimalFormat("##.00");
    private Disciplina disc;
    private double n1;
    private double n2;
    private double n3;

    String exibirNotas(){
        double media = (getN1()+getN2()+getN3())/3;
        return disc.getNome()+" - "+df.format(media);
    }

    //Gets e sets

    public Disciplina getDisc() {
        return disc;

    }

    public void setDisc(Disciplina disc) {
        this.disc = disc;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
}
