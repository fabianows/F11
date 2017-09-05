package f11.capitulo4;

public class Funcionario{
    String nomeFuncionario;
    String departamentoFuncionario;
    double salarioFuncionario;
    Data dataEntradaNoBanco;
    String RGFuncionario;

    public void recebeAumento(double incrementoSalario) {
        setSalarioFuncionario(getSalarioFuncionario() + incrementoSalario);
    }
    
    public Double calculaGanhoAnual(){
        return getSalarioFuncionario() * 12;
    }
    
    public void mostra(){
        System.out.println("Funcionario: "+getNomeFuncionario());
        System.out.println("Departamento: "+getDepartamentoFuncionario());
        System.out.println("Data de entrada no Banco: "+ dataEntradaNoBanco.dataFormatada());
        System.out.println("RG do Funcionario: "+getRGFuncionario());
        System.out.println("Salario atual: " + getSalarioFuncionario());
    }
    
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getDepartamentoFuncionario() {
        return departamentoFuncionario;
    }

    public void setDepartamentoFuncionario(String departamentoFuncionario) {
        this.departamentoFuncionario = departamentoFuncionario;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public String getRGFuncionario() {
        return RGFuncionario;
    }

    public void setRGFuncionario(String RGFuncionario) {
        this.RGFuncionario = RGFuncionario;
    }

    public Data getDataEntradaNoBanco() {
        return dataEntradaNoBanco;
    }

    public void setDataEntradaNoBanco(Data dataEntradaNoBanco) {
        this.dataEntradaNoBanco = dataEntradaNoBanco;
    }

}
