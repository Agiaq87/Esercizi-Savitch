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
package ex2_6_12;


import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex2_6_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        tastiera.useDelimiter("i");
        
        System.out.println("Scrivi una stringa.");
        
        String a = tastiera.next();
        String b = tastiera.next();
        
        System.out.println("a e' " + a);
        System.out.println("b e' " + b);
        
        /*
        Scrivi una stringa.
Ciao a tutti
a e' C
b e' ao a tutt
        */
    }
    
}
