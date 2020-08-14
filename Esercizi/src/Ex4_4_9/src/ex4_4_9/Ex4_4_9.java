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
package ex4_4_9;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex4_4_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserire una stringa");
        String read = tastiera.nextLine();
        String inverse = "";
        
        // Questo è un primo modo
        //for (int i = 0; i <= read.length()-1; i++){
        //    inverse = inverse + read.charAt(read.length() - i - 1);
        //}
        
        // Questo è un modo migliore
        for (int i = read.length()-1; i >= 0; i--){
            inverse += read.charAt(i);
        }
        
        System.out.println(inverse);
        
        // Esempio di For-each
        for (char c: read.toCharArray()){
            System.out.print(c);
        }
        
        
    }
    
}
