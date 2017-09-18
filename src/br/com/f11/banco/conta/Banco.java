package br.com.f11.banco.conta;

import br.com.f11.banco.conta.Conta;

public class Banco {
    Conta[] conta;
    private int totalDeContas;
    
    public void adicionaConta(Conta conta, int indice){
        this.conta[indice] = conta;
        this.totalDeContas += this.totalDeContas;
    }
    
    public Conta pegaConta(int indice){
        return this.conta[indice];
    }
    
    public int pegaTotalDeContas(){
        return this.totalDeContas;
    }

        public void setConta(Conta[] conta) {
        this.conta = conta;
    }

}
