/*
Copyright (C) 2020  Alessandro Giaquinto agiaquinto87@gmail.com
This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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
