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
