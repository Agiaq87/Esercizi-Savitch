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
package ex2_6_2;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex2_6_2 {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserire un numero in virgola mobile: ");
        
        double x = tastiera.nextDouble();
        int y = (int)x;
        
        System.out.printf("Il valore di x: %f\n", x);
        System.out.printf("Il valore di y: %d\n", y);
        
        byte z = (byte)x;
        
        System.out.printf("Il valore di x: %f\n", x);
        System.out.printf("Il valore di z: %d\n", z);
        
        /*
        Inserire un numero in virgola mobile: 
        2e-11
        Il valore di x: 0,000000
        Il valore di y: 0
        Il valore di x: 0,000000
        Il valore di z: 0
        
        Inserire un numero in virgola mobile: 
        2e11
        Il valore di x: 200000000000,000000
        Il valore di y: 2147483647
        Il valore di x: 200000000000,000000
        Il valore di z: -1
        */
    }
    
}
