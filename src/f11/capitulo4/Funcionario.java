package f11.capitulo4;

public class Funcionario{
    private String nomeFuncionario;
    private String departamentoFuncionario;
    private double salarioFuncionario;
    private Data dataEntradaNoBanco;
    private String RGFuncionario;
    private int identificador = 0;


    public Funcionario(){        
    }
    
    public Funcionario(String nome, String departamento, String RG,  Double salario, int dia, int mes, int ano){
        this.setNomeFuncionario(nome);
        this.setDepartamentoFuncionario(departamento);
        this.setRGFuncionario(RG);
        this.setSalarioFuncionario(salario);

        Data dataEntradaNoBanco = new Data(dia, mes, ano);        
        
        this.setDataEntradaNoBanco(dataEntradaNoBanco);
        this.setIdentificador(1);
    }
    
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
    
    public int getIdentificador() {
        return identificador;
    }

    private void setIdentificador(int identificador) {
        this.identificador += identificador;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    private void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getDepartamentoFuncionario() {
        return departamentoFuncionario;
    }

    private void setDepartamentoFuncionario(String departamentoFuncionario) {
        this.departamentoFuncionario = departamentoFuncionario;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    private void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public String getRGFuncionario() {
        return RGFuncionario;
    }

    private void setRGFuncionario(String RGFuncionario) {
        this.RGFuncionario = RGFuncionario;
    }

    public Data getDataEntradaNoBanco() {
        return dataEntradaNoBanco;
    }

    private void setDataEntradaNoBanco(Data dataEntradaNoBanco) {
        this.dataEntradaNoBanco = dataEntradaNoBanco;
    }

}
