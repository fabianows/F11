package f11.novobanco;

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;       
    }

    public void roda(Conta c) {
        System.out.println("Saldo anterior: "+c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Saldo novo : "+c.getSaldo());
        this.saldoTotal = this.saldoTotal + c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

}
