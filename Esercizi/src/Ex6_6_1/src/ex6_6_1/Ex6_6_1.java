/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_6_1;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nota bene: var è usato per il type inference
        // E' il compilatore a determinare il tipo
        var temps = new double[10];
        var avg = 0.0;
        
        Scanner s = new Scanner(System.in);
        
        
        for (int i = 0; i < temps.length; i++) {
            temps[i] = s.nextDouble();
        }
        
        // Nota bene: Questa è la sintassi foreach in java, che evita il lancio della famosa eccezione ArrayOutOfBoundException...
        // Puoi usarlo per leggere gli elementi dell'array, ma non per effettuare operazioni di scrittura...
        // In questo caso si poteva risparmiare, è stato aggiunto solamente come "segnalibro" quando rivedo gli esercizi
        for (double t: temps) {
            avg += t;
        }
        
        System.out.println(avg / temps.length);
    }
    
}
