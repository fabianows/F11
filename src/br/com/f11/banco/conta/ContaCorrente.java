package br.com.f11.banco.conta;

import br.com.f11.banco.conta.Tributavel;
import br.com.f11.banco.conta.Conta;

public class ContaCorrente extends Conta implements Tributavel{
    
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

    @Override
    public double calculaTributos(){
        return this.getSaldo() * 0.01;
    }
    
}
