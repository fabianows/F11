package br.com.f11.banco;

import br.com.f11.banco.conta.Banco;
import br.com.f11.banco.sistema.AtualizadorDeContas;
import br.com.f11.banco.conta.ContaPoupanca;
import br.com.f11.banco.conta.ContaCorrente;
import br.com.f11.banco.conta.Conta;

public class TestaAtualizadorDeContas {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        cc.deposita(1000);
        cp.deposita(1000);

        Banco banco = new Banco();
        
        Conta[] conta = new Conta[2];
        banco.setConta(conta);


        banco.adicionaConta(cc, 0);
        banco.adicionaConta(cp, 1);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        
        for (int i=0; i<2; i++) {
            adc.roda(banco.pegaConta(i));
        }
        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}
