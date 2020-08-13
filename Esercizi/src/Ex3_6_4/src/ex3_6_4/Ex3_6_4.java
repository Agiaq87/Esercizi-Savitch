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
package ex3_6_4;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex3_6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserire la frase:");
        
        String a = tastiera.nextLine();
        
        if (a.endsWith("?") && (a.length() % 2 == 0) ){
            System.out.println("Si");
        }else if (a.endsWith("?") && (a.length() % 2 != 0) ){
            System.out.println("No");
        }else if (a.endsWith("!")){
            System.out.println("Wow");
        }else{
            System.out.println("Tu dici sempre \"" + a + "\"");
        }
    }
    
}
