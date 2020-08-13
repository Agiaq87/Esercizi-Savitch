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
package ex2_8_8;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex2_8_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserire il peso in Kg:");
        
        double kg = tastiera.nextDouble();
        
        System.out.println("Inserire l'altezza in cm:");
        
        int cm = tastiera.nextInt();
        
        System.out.println("Inserire l'eta in anni:");
        
        int old = tastiera.nextInt();
        
        double resultMan = 655 + (9.6 * kg) + (1.8 * cm) - (4.7 * old);
        double resultWoman = 66 + (13.8 * kg) + (5.0 * cm) - (6.8 * old);
        
        System.out.println(
                "Il numero di barrette di cioccolato (da 230 Kcal) "
                + "consumabili da un individuo con i seguenti dati: \n"
                + "\tAltezza: " + cm + " cm\n"
                + "\tPeso: " + kg + " kg\n"
                + "\tEtà: " + old + " anni\n"
                + "è per"
        );
        System.out.printf("\tUn uomo: %.0f\n", resultMan / 230);
        System.out.printf("\tUna donna: %.0f\n", resultWoman / 230);
    }
    
}
