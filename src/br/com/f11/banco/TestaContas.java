package br.com.f11.banco;

import br.com.f11.banco.conta.ContaPoupanca;
import br.com.f11.banco.conta.ContaCorrente;
import br.com.f11.banco.conta.Conta;

public class TestaContas {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.deposita(1000);
        cp.deposita(1000);
        
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
