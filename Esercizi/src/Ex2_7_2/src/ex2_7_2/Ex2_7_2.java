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
package ex2_7_2;


import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex2_7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
      
        System.out.println("Inserire la prima stringa:");
        
        String a = tastiera.nextLine();
        
        System.out.println("Inserire la seconda stringa:");
        
        String b = tastiera.nextLine();
        
        System.out.println("Prima stringa: \'" + a + "\' di lunghezza della stringa: " + a.length());
        System.out.println("Seconda stringa: \'" + b + "\' di lunghezza della stringa: " + b.length());
        
        String c = a + " " + b;
        System.out.println("Stringa concatenata: \'" + c + "\' di lunghezza della stringa: " + c.length());
        
        /*
        Inserire la prima stringa:
Ciao
Inserire la seconda stringa:
mondo
Prima stringa: 'Ciao' di lunghezza della stringa: 4
Seconda stringa: 'mondo' di lunghezza della stringa: 5
Stringa concatenata: 'Ciao mondo' di lunghezza della stringa: 10
        */
    }
    
}
