package br.com.f11.banco;

import br.com.f11.banco.conta.SeguroDeVida;
import br.com.f11.banco.sistema.GerenciadorDeImpostoDeRenda;
import br.com.f11.banco.conta.ContaCorrente;

public class TestaGerenciadorDeImpostoDeRenda {

    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);
        System.out.println(gerenciador.getTotal());
        System.out.printf("O saldo é: %.2f\n", cc.getSaldo());
    }
}
