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
package ex2_8_7;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex2_8_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserire il raggio del tubo in cm:");
        
        double radius = tastiera.nextInt();
        
        radius /= 100; // Converto in metri
        
        System.out.println("Inserisci la profondità in m:");
        
        double depth = tastiera.nextInt();
        
        System.out.printf(
                "Litri d'acqua immagazzinati nel tubo: %d\n", 
                (int)(Math.PI * (radius * radius) * depth) * 1000  // Converto da m^3 a litri -> 1 m^3 = 1000 l
                );
    }
    
}
