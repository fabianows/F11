package br.com.f11.banco.conta;

public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public void mudaCPF(String cpf) {
        if (this.idade <= 60) {
            validaCPF(cpf);
        }
        this.cpf = cpf;
    }
    private void validaCPF(String cpf) {
// série de regras aqui, falha caso não seja válido
    }
}
