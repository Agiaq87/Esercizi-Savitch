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
package ex5_6_2;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex5_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int a;
        String nm;
        
        do{
            System.out.println("Inserisci il numero di ripetizioni:");
            a = tastiera.nextInt();
            System.out.println("Inserisci il nome:");
            nm = tastiera.next();
            
            System.out.println("Risultato del metodo: ");
            Ex5_6_2.saluta(nm, a);
            System.out.println("Premere 'c' per ripetere, 'e' per uscire");
        }while(tastiera.next().equalsIgnoreCase("c"));
        
        
    }
    
    public static int confronta(int first, int second){
        return (first > second ) ? first-second : second-first;
    }
    
    public static void saluta(String name, int repeat){
        for (int i = 0; i <= repeat; i++){
            System.out.println("Ciao " + name);
        }
    }

    
}
