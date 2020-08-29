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
package ex6_6_6;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserire una stringa");
        
        String temp = s.nextLine();
        
        char[] t = rimuoviDuplicati(temp.toCharArray());
        
        System.out.println(t);
        
    }
    
    private static char[] rimuoviDuplicati(char[] in) {
        String temp = "";
        
        for (char c: in) {
            if (!temp.contains( Character.toString(c) ) ) {
                temp += c;
            }
        }
        
        return temp.toCharArray();
    }
    
    /*
    Inserire una stringa
abababababasdnsdjnsdjsndandsndjnasdjnaskdj
absdnjk
    */
}
