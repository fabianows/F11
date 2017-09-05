package f11.capitulo4;

public class Data {
    int dia;
    int mes;
    int ano;
    
    public String dataFormatada(){
        String dia = Integer.toString(this.getDia());
        String mes = Integer.toString(this.getMes());
        String ano = Integer.toString(this.getAno());
        String data = dia + "/" + mes + "/" + ano;
        return data;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
