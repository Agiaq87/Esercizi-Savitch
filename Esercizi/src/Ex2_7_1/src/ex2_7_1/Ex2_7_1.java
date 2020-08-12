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
package ex2_7_1;


import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex2_7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Calcolo della media di tre numeri interi");
        System.out.println("Inserire il primo intero:");
        
        int a = tastiera.nextInt();
        
        System.out.println("Inserire il secondo intero:");
        
        int b = tastiera.nextInt();
        
        System.out.println("Inserire il terzo intero:");
        
        int c = tastiera.nextInt();
        
        double average = (a+b+c)/3.0;
        
        System.out.printf("Il risultato della media è: %f\n", average);
        
        /*
        Calcolo della media di tre numeri interi
Inserire il primo intero:
3
Inserire il secondo intero:
4
Inserire il terzo intero:
5
Il risultato della media è: 4,000000
        
        Calcolo della media di tre numeri interi
Inserire il primo intero:
1
Inserire il secondo intero:
99
Inserire il terzo intero:
100
Il risultato della media è: 66,666667
        */
    }
    
}
