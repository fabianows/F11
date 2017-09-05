/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f11.capitulo3;

/**
 *
 * @author 026260461783
 */
public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;        
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaMensal = (gastosTrimestre / 3);
        int divisao;
        
        System.out.println("Gastos do Trimestre: " + gastosTrimestre);
        System.out.println("Média mensal: "+ mediaMensal);
        
/*        divisao = mediaMensal / 0.0;
        
        System.out.println(divisao);
*/        
    }
    
}
