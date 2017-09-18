package br.com.f11.banco;

import br.com.f11.banco.conta.ContaCorrente;
import br.com.f11.banco.conta.Conta;

class TestaContaEstouro {

    public static void main(String args[]) {
// a Conta
        Conta minhaConta = new ContaCorrente();
// quero mudar o saldo para -200
        double novoSaldo = -200;
// testa se o novoSaldo ultrapassa o limite da conta
        if (novoSaldo < -minhaConta.getSaldo()) { //
            System.out.println("Não posso mudar para esse saldo");
        } else {
            minhaConta.saldo = novoSaldo;
        }
    }
}
