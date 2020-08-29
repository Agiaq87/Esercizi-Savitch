/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_6_3;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Il type Inference non è usabile con gli array già inizializzati
        String[] flowers = {"petunie","viole","rose","violette","garofani"};
        double[] prices = {0.50, 0.75, 1.50, 0.50, 0.80};
        Scanner s = new Scanner(System.in);
        
        System.out.println("Quale fiore vuoi comprare?");
        for (String t: flowers){
            System.out.println(t);
        }
        
        String choice = s.next();
        int i = 0;
        int qty = 0;
        
        for ( i = 0; i < flowers.length; i++) {
            if (flowers[i].equalsIgnoreCase(choice)) {
                System.out.println("Inserire la quantità: ");
                qty = s.nextInt();
                System.err.println(i);
                System.out.println("Sono " + qty * prices[i] + " €");
                break;
            }
        }
        
        
        
        
    }
    
}
