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
package ex4_4_1;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex4_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserire una stringa:");
        String read = tastiera.nextLine();
        
        while(!read.equalsIgnoreCase("fine")){
            
            /*if (read.charAt(0) == read.charAt(read.length()-1)){
                System.out.println("La stringa immessa ha lo stesso carattere iniziale e finale"); 
            } else {
                System.out.println("La stringa immessa NON ha lo stesso carattere iniziale e finale");
            }*/
            
            System.out.println(
            (read.charAt(0) == read.charAt(read.length()-1)) 
                    ?
                    "La stringa immessa ha lo stesso carattere iniziale e finale"
                    :
                    "La stringa immessa NON ha lo stesso carattere iniziale e finale"
            );
    
            System.out.println("Inserire una stringa:");
            read = tastiera.nextLine();
        }
        
        /*
        Inserire una stringa:
ciac
La stringa immessa ha lo stesso carattere iniziale e finale
Inserire una stringa:
ciao
La stringa immessa NON ha lo stesso carattere iniziale e finale
Inserire una stringa:
fune
La stringa immessa NON ha lo stesso carattere iniziale e finale
Inserire una stringa:
feni
La stringa immessa NON ha lo stesso carattere iniziale e finale
Inserire una stringa:
doctor games
La stringa immessa NON ha lo stesso carattere iniziale e finale
Inserire una stringa:
Monkey D. Luffy
La stringa immessa NON ha lo stesso carattere iniziale e finale
Inserire una stringa:
Angry Video Game Nerds
La stringa immessa NON ha lo stesso carattere iniziale e finale
Inserire una stringa:
Yotoby
La stringa immessa NON ha lo stesso carattere iniziale e finale
Inserire una stringa:
yotoby
La stringa immessa ha lo stesso carattere iniziale e finale
Inserire una stringa:
fine
        */
    }
    
}
