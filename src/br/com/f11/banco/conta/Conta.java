package br.com.f11.banco.conta;

public abstract class Conta {

    public double saldo;
    private int numero;

    public void deposita(double valor) {
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor;
        }
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean equals(Object obj) {
        Conta outraConta = (Conta) obj;
        return this.numero == outraConta.numero;
    }

    public abstract void atualiza(double taxa);
}
