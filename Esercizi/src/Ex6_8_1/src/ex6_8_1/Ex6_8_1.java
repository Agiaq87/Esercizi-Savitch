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
package ex6_8_1;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] alphabet = new int[26];
        
        System.out.println("Inserire una stringa che termini con un punto .");
        String quote = s.nextLine().toLowerCase();
        
        for (char c: quote.toCharArray()) {
            if (c != '.') {
                int i = (int) c - (int)'a';
                if (Character.isLetter(c) && !Character.isDigit(c) && (i >= 0 && i < 26)) {
                    alphabet[i]++;
                    System.out.println(c);
                }
            }
        }
        
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println("[ " + Character.toString(i + (int)'a') + " ] -> " + alphabet[i]);
        }
    }
    
}
