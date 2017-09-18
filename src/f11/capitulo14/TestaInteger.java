package f11.capitulo14;

import java.io.PrintStream;

public class TestaInteger {

    public static void main(String args[]) {
        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);
        int x3;
        String s1 = "2";
        String s2 = "a";
        
        x3 = Integer.parseInt(s2);
        System.out.println(x3);      
        
        if (x1.equals(x2)) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

        
        PrintStream saida = System.out;
saida.println("ola");

        
    }
}
