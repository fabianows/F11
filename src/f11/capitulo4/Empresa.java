package f11.capitulo4;

public class Empresa {
    private String nomeEmpresa;
    private String CNPJEmpresa;
    Funcionario[] empregados;
    private int qtdeEmpregadosAdicionados;
    
    public void adicionaFuncionario(Funcionario funcionario, int indice){
        this.empregados[indice] = funcionario;
        this.qtdeEmpregadosAdicionados = this.qtdeEmpregadosAdicionados + 1;
    }
    
    public void mostraempregados(){
        for (int i = 0; i < this.qtdeEmpregadosAdicionados; i++) {
            System.out.println("Funcionario "+this.empregados[i].getNomeFuncionario()+" adicionado.");
            System.out.println("Salário "+this.empregados[i].getSalarioFuncionario());
        }
    }
    
    public boolean existeFuncionario(Funcionario funcionario){
        boolean comparacao = false;
        
        if (this.qtdeEmpregadosAdicionados > 0) {
            for (int i = 0; i < this.qtdeEmpregadosAdicionados; i++) {
                if (funcionario.getRGFuncionario() == this.empregados[i].getRGFuncionario()) {
                    System.out.println("funcionário já existe");
                    comparacao = true;
                } else {
                    comparacao = false;
                }
            }
            
        }
        
        return comparacao;
    }

    public Funcionario[] getEmpregados() {
        return empregados;
    }

    public void setEmpregados(Funcionario[] empregados) {
        this.empregados = empregados;
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
