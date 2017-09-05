package f11.capitulo4;

public class PessoaFisica {
    private String nomePessoaFisica;
    private String cpfPessoaFisica;
    
    public PessoaFisica(String cpf){
        if (this.validaCpf(cpf)){
            this.cpfPessoaFisica = cpf;
        }        
    }
    
    public boolean validaCpf(String cpf){
        return true;
    }
}
