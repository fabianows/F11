package f11.capitulo4;

public class TestaEmpresa {
    
    public static void main(String[] args){
        Empresa empresa = new Empresa();
        empresa.setNomeEmpresa("Empresa1");
        empresa.setCNPJEmpresa("0000000000000");
        
        Funcionario[] empregados = new Funcionario[10];
        empresa.setEmpregados(empregados);

        TesteFuncionario testeFuncionario = new TesteFuncionario();
        
        Funcionario funcionario1 = new Funcionario("Carlos", "TI", "126548", 100.00, 01, 01, 1999);
        //funcionario1 = testeFuncionario.criaFuncionario("Carlos", "TI", "126548", 100.00, 01, 01, 1999);
        if (!empresa.existeFuncionario(funcionario1)){
            empresa.adicionaFuncionario(funcionario1, 0);
        }

        Funcionario funcionario2 = new Funcionario("Jose", "RH", "9563624", 150.22, 31, 12, 2000);     
        //funcionario2 = TesteFuncionario.criaFuncionario("Jose", "RH", "9563624", 150.22, 31, 12, 2000);
        if (!empresa.existeFuncionario(funcionario2)){
            empresa.adicionaFuncionario(funcionario2, 1);
        }

        empresa.mostraempregados();
    }
    
}
