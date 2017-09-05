package f11.capitulo4;

class TesteFuncionario{
    public static void main(String[] args){        
        double valorDeAumento;       
       
        Funcionario funcionario1 = new Funcionario();
        funcionario1 = criaFuncionario("Carlos", "TI", "126548", 100.00, 01, 01, 1999);

        Funcionario funcionario2 = new Funcionario();        
        funcionario2 = criaFuncionario("Jose", "RH", "9563624", 150.22, 31, 12, 2000);

        comparaFuncionarios(funcionario1, funcionario2);
        
        funcionario1.mostra();

        valorDeAumento = 100.00;
        funcionario1.recebeAumento(valorDeAumento);
        System.out.println("Salario com aumaneto: " + funcionario1.getSalarioFuncionario());
        
        System.out.println("Ganho anual: " + funcionario1.calculaGanhoAnual());

        funcionario2.mostra();
        
    }
    
    public static Funcionario criaFuncionario(String nome, String departamento, String RG,  Double salario, int dia, int mes, int ano){
        Funcionario funcionario = new Funcionario();      

        funcionario.setNomeFuncionario(nome);
        funcionario.setDepartamentoFuncionario(departamento);
        funcionario.setRGFuncionario(RG);
        funcionario.setSalarioFuncionario(salario);

        Data dataEntradaNoBanco = new Data();        
        dataEntradaNoBanco.setDia(dia);
        dataEntradaNoBanco.setMes(mes);
        dataEntradaNoBanco.setAno(ano);
        
        funcionario.setDataEntradaNoBanco(dataEntradaNoBanco);
        
        return funcionario;
    }
    
    private static void comparaFuncionarios(Funcionario f1, Funcionario f2){
        if (f1.getRGFuncionario() == f2.getRGFuncionario()){
            System.out.println("Os dois funcionarios são iguais");
        }
        else {
            System.out.println("Os funcionarios são diferentes");
        }        
    }
}