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
