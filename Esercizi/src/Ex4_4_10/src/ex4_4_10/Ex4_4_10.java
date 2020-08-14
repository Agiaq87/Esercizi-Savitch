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
package ex4_4_10;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex4_4_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int count = 0, t = 0, c = 0;
        
        System.out.println("Per ciascun lancio della moneta, inserisci t se è uscito testa e c se è uscito croce.");
        String read = "";
        
        while(count < 8){
           System.out.println("Lancio " + (count + 1) + ": "); 
           
           read = tastiera.nextLine();
           
           switch (read){
               case "t":{
                   t++;
                   count++;
                   break;
               }
               case "c":{
                   c++;
                   count++;
                   break;
               }   
               default:{
                   System.out.println("Non è un valore valido");
                   break;
               }
           }
           
        }
        
        System.out.printf("Percentuale di teste: %.2f\n", ( ((double)t/8)*100 ));
        System.out.printf("Percentuale di code: %.2f\n", ( ((double)c/8)*100 ));
        
    }
    
}
