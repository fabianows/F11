package f11.capitulo4;

public class Empresa {
    String nomeEmpresa;
    String CNPJEmpresa;
    Funcionario[] empregados;
    int contaQtdeEmpregadosAdicionados;
    
    public void adicionaFuncionario(Funcionario funcionario, int indice){
        this.empregados[indice] = funcionario;
        this.contaQtdeEmpregadosAdicionados = this.contaQtdeEmpregadosAdicionados + 1;
    }
    
    public void mostraempregados(){
        for (int i = 0; i < this.contaQtdeEmpregadosAdicionados; i++) {
            System.out.println("Funcionario "+this.empregados[i].getNomeFuncionario()+" adicionado.");
            System.out.println("Salário "+this.empregados[i].getSalarioFuncionario());
        }
    }
    
    public boolean existeFuncionario(Funcionario funcionario){
        boolean comparacao = false;
        for (int i = 0; i < this.contaQtdeEmpregadosAdicionados; i++) {
            if (funcionario.getRGFuncionario() == this.empregados[i].getRGFuncionario()){
                System.out.println("funcionário já existe");
                comparacao = true;
            }
            else{
                comparacao = false;
            }
        }
        
        return comparacao;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCNPJEmpresa() {
        return CNPJEmpresa;
    }

    public void setCNPJEmpresa(String CNPJEmpresa) {
        this.CNPJEmpresa = CNPJEmpresa;
    }
    
}
