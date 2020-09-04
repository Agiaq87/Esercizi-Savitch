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
package ex6_7_3;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        
        System.out.println("Quanti interi si vogliono inserire?");
        int length = s.nextInt();
        
        var arr = new int[length];
        
        for (int i = 0; i < length; i++) {
            System.out.println("Inserire l'intero: ");
            arr[i] = s.nextInt();
        }
        
        traslaADestra(arr);
        
        System.out.print("\n[");
        
        for (int t: arr) {
            System.out.print(" " + t + ", ");
        }
        
        System.out.print("]\n");
        
    }
    
    public static void traslaADestra(int[] array) {
        int first = array[0];
        int second = array[1];
        
        for (int i = 0; i + 2 < array.length; i++) {
            array[i] = array[i+2];
        }
        
        array[array.length - 2] = first;
        array[array.length - 1] = second;
    }
    
}
