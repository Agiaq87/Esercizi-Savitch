/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_7_1;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Quanti interi verranno inseriti?: ");
        
        var arr = new int[s.nextInt() + 1];
        
        System.out.println("Inserire " + (arr.length - 1)  + " interi, uno per riga");
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = s.nextInt();
        }
        
        int somma = somma(arr);
        System.out.println("La somma è: " + somma);
        System.out.println("I numeri sono:");
        
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + ", che è il " + ( ((double)arr[i]*somma)/100 ) + "% della somma");
        }
        
    }
    
    public static int somma(int[] a) {
        int temp = 0;
        
        for (int i = 0; i < a.length - 1; i++) {
            temp += a[i];
        }
        
        return temp;
    }
    
}
