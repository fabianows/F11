package f11.capitulo4;

public class Gerente extends Funcionario{

    int senha;
    int numeroDeFuncionariosGerenciados;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    @Override
    public double getBonificacao() {
        return this.salarioFuncionario * 1.4 + 1000;
    }
}
