package f11.capitulo3;

public class Exercicio4{
    public static void main(String[] args){
        long fatorial = 1;
        for(int i=1; i<=20; i++){
            fatorial = fatorial * i;
        }
        
        System.out.println("Fatorial igual a: "+ fatorial);
            
    }
}