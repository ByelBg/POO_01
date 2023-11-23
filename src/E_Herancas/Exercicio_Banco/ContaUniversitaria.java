package E_Herancas.Exercicio_Banco;

import E_Herancas.Exercicio_Banco.Conta;

public class ContaUniversitaria extends Conta {

    public ContaUniversitaria() {
    }

    public ContaUniversitaria(int numero, int agencia, String cliente) {
        super(numero, agencia, cliente);
    }

    @Override
    public boolean deposito(double vl) {
        if(saldo + vl <2000){
            return super.deposito(vl);
        }
        return false;
    }
}
