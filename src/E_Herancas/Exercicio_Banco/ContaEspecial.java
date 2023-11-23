package E_Herancas.Exercicio_Banco;

import E_Herancas.Exercicio_Banco.Conta;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial() {
        super();
        setLimite(0);
    }

    public ContaEspecial(int numero, int agencia, String cliente, double limite) {
        super(numero, agencia, cliente);
        this.limite = limite;
    }

    @Override
    public boolean saque(double vl) {
        if((limite + saldo) >= vl){
            saldo -= vl;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" - Limite: R$"+getLimite();
    }

    //Getter e setter
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
