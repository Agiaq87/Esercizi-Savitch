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
package ex4_6_2;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex4_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String temp = "";
        
        System.out.println("Inserire la parola da verificare:");
        String read = tastiera.nextLine();
        
        
        for (int i = 0; i < read.length(); i++){
            temp += read.charAt(read.length() - 1 - i);
        }
        
        if (temp.equalsIgnoreCase(read)){
            System.out.println("E' palindroma");
        }else{
            System.out.println("Non e' palindroma");
        }
        
    }
    
}
