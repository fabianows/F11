package br.com.f11.banco.conta;

import br.com.f11.banco.conta.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

}
