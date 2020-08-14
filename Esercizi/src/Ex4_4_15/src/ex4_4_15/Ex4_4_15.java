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
package ex4_4_15;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex4_4_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int k = 0, sum = 0, read = 0;
        String choice;
        
        do{
            System.out.println("Inserire un valore intero positivo");
            read = tastiera.nextInt();
            
            if (read > 0){
                k++;
                sum+=read;
                System.out.println(sum);
                System.out.println(k);
            }else{
                System.out.println("E' stato inserito un valore negativo che non verrà considerato");
            }
            System.out.println("Per inserire un nuovo valore inserire 'c', altrimenti inserire 'e'");
            choice = tastiera.next();
        }while(choice.equalsIgnoreCase("c"));
        
        System.out.printf("Il risultato è: %f\n", Math.pow(sum, 1.0/k));
    }
    
}
