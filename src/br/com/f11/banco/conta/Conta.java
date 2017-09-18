package br.com.f11.banco.conta;

public abstract class Conta {

    public double saldo;

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

    public abstract void atualiza(double taxa);
}
