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
package ex6_6_13;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_6_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var figura = new int[4][5];
        
        // Popolamento array con valori random
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                figura[i][j] = (int) Math.floor( Math.random()*99 ); 
            }
        }
        
        // Stampa dell'array multidimensionale
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + figura[i][j] + " ");
            }
            System.out.println();
        }
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserire il valore di soglia: ");
        int soglia = s.nextInt();
        
        // Corpo del metodo statico
        cercaSoglia(figura,soglia);
        
        // Stampa dell'array multidimensionale
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + figura[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    public static void cercaSoglia(int[][] matrix, int searchedValue) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] > searchedValue) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    
}
