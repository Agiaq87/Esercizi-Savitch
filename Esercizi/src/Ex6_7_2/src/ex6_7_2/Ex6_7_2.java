/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_7_2;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] utenti = {"Enrico Brignano", "Gigi Proietti", "Vincenzo Salemme", "Paolo Noise", "Leone di Lernia"};
        String[] telefoni = {"333-3nrico", "6161-pr014771", "333-5a74mm4", "333-n0154", "000-paparu7"};
        
        System.out.println("Digita il nome cercato:");
        Scanner s = new Scanner(System.in);
        
        String temp = s.nextLine().toLowerCase();
        
        System.out.println("Il numero di telefono cercato è: " + cercaNome(utenti,telefoni,temp));
        
    }
    
    public static String cercaNome(String[] names, String[] tel, String searchedName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().contains(searchedName)) {
                return tel[i];
            }    
        }
        
        return " ";
    }
    
}
