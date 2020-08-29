/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_6_2;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        var max = 0.0;
        int[] famiglieMinore;
        var countFamiglieMinore = 0;
        
        // Attenzione, NON SI DOVREBBE FARE MAI SENZA UN CHECK!!!!
        var arr = new int[s.nextInt()];
        
        for (int i = 0; i < arr.length; i++){
            System.out.println("Prego inserire ora il reddito");
            arr[i] = s.nextInt();
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        
        System.out.println(max);
        max/=10;
        
        for (int t: arr) {
            if (t <= max) {
                countFamiglieMinore++;
                System.out.println(t);
            }
        }
        
        System.out.println("Numero di famiglie trovato: " + countFamiglieMinore);
        
        
    }
    
}
