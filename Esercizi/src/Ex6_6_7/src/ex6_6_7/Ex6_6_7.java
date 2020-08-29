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
package ex6_6_7;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String temp = "";
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserire una sequenza di numeri separati dalla virgola:");
        temp = s.nextLine();
        
        var t = temp.split(",");
        var arr = new int[t.length];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(t[i]);
        }
        
        arr = rimuovi(3, arr);
        
        for (int i: arr) {
            System.out.println(i);
        }
        
    }
    
    public static int[] rimuovi(int v, int[] in) {
        int count = 0;
        int[] ret;
        
        for (int i: in) {
            if (i != v) {
                count++;
            }
        }
        
        ret = new int[count];
        count = 0;
        
        for (int i = 0; i < in.length; i++) {
            if (in[i] != v) {
                ret[count++] = in[i];
            }
        }
        
        return ret;
    }
    
}
