package br.com.f11.banco.conta;

import br.com.f11.banco.conta.Tributavel;

public class SeguroDeVida implements Tributavel {

    @Override
    public double calculaTributos() {
        return 42;
    }
}
