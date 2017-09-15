package f11.novobanco;

public class ContaCorrente extends Conta {
    
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }
}
