package f11.capitulo3;

public class Exercicio2 {

    public static void main(String[] args){
        int soma;
        soma = 0;
        
        for(int i=1; i<1001; i++){
            soma = soma + i;
        }

        System.out.println("Soma de 1 até 1000: "+ soma);
    }
}