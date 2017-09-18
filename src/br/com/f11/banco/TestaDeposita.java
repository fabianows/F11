package br.com.f11.banco;

import br.com.f11.banco.conta.ValorInvalidoException;
import br.com.f11.banco.conta.ContaPoupanca;
import br.com.f11.banco.conta.Conta;

public class TestaDeposita {

    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        try {
            cp.deposita(-100);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }

    }
}
