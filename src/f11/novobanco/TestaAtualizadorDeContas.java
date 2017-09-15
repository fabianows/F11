package f11.novobanco;

public class TestaAtualizadorDeContas {

    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        Banco banco = new Banco();
        
        Conta[] conta = new Conta[3];
        banco.setConta(conta);


        banco.adicionaConta(c, 0);
        banco.adicionaConta(cc, 1);
        banco.adicionaConta(cp, 2);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        
        for (int i=0; i<3; i++) {
            adc.roda(banco.pegaConta(i));
        }
/*
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
*/
        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}
