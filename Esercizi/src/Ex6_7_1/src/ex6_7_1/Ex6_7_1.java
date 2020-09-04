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
package ex6_7_1;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Quanti interi verranno inseriti?: ");
        
        var arr = new int[s.nextInt() + 1];
        
        System.out.println("Inserire " + (arr.length - 1)  + " interi, uno per riga");
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = s.nextInt();
        }
        
        int somma = somma(arr);
        System.out.println("La somma è: " + somma);
        System.out.println("I numeri sono:");
        
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + ", che è il " + ( ((double)arr[i]*somma)/100 ) + "% della somma");
        }
        
    }
    
    public static int somma(int[] a) {
        int temp = 0;
        
        for (int i = 0; i < a.length - 1; i++) {
            temp += a[i];
        }
        
        return temp;
    }
    
}
