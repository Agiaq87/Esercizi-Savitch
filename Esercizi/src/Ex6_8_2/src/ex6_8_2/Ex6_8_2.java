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
package ex6_8_2;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserire una frase seguita da un punto:");
        String read = s.nextLine().toLowerCase().replaceAll(" ","").replaceAll("'", "");
        System.out.println(read);
        var temp = read.split(Pattern.quote("."));
        
        for (String t: temp){
            System.out.println("La string a valutata è: " + t + "\nPalindroma?" + palindroma(t));
        }
    }
    
    public static boolean palindroma(String string){
        int i = 1;
        
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            for (; i < string.length() - 1; i++){
                if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                    return false;
                }
            }
        }
        
        return i == string.length()-1;
    }
    
}
