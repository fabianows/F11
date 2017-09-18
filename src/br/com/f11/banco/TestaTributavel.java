package br.com.f11.banco;

import br.com.f11.banco.conta.Tributavel;
import br.com.f11.banco.conta.ContaCorrente;

class TestaTributavel {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
// testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}
