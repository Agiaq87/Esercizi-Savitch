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
package ex2_6_3;


import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex2_6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserire un numero in virgola mobile: ");
        
        double x = tastiera.nextDouble();
        double y = x % 2.0;
        
        System.out.printf("Il valore di x: %f\n", x);
        System.out.printf("Il valore di z: %f\n", y);
        
        int z = (int)x;
        
        System.out.printf("Il valore di x: %f\n", x);
        System.out.printf("Il valore di z: %d\n", z);
        System.out.printf("Il resto della divisione tra z e 2: %f\n", z % 2.0);
        
        /*
        Inserire un numero in virgola mobile: 
        5,5
        Il valore di x: 5,500000
        Il valore di z: 1,500000
        Il valore di x: 5,500000
        Il valore di z: 5
        Il resto della divisione tra z e 2: 1,000000
        
        Inserire un numero in virgola mobile: 
        -5,5
        Il valore di x: -5,500000
        Il valore di z: -1,500000
        Il valore di x: -5,500000
        Il valore di z: -5
        Il resto della divisione tra z e 2: -1,000000
        */
    }
    
}
