package f11.banco;

class Conta {

    int numero;       
    private double saldo;
    private double limite;
    private Cliente titular;
    private static int totalDeContas;

// construtor
    Conta() {
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
    
    Conta(Cliente titular) {
        this.titular = titular;
    }

    Conta(int numero, Cliente titular) {
        this(titular); // chama o construtor que foi declarado acima
        this.numero = numero;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
    
    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void saca(double quantidade) {
//posso sacar até saldo+limite
        if (quantidade > this.saldo + this.limite) {
            System.out.println("Não posso sacar fora do limite!");
        } else {
            this.saldo = this.saldo - quantidade;
        }
    }
 
    boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
// não deu pra sacar!
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }
}
