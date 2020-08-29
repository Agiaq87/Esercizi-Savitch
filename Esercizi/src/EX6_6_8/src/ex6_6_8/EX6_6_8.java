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
package ex6_6_8;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class EX6_6_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {0,0,3,4,7};
        int[] b = {0,4,0,1,2};
        
        var temp = combinaOrdini(a,b);
        
        for (int t: temp) {
            System.out.print(t);
        }
    }
    
    public static int[] combinaOrdini(int[] one, int[] two) {
        int[] ret = new int[one.length];
        
        for (int i = 0; i < one.length; i++) {
            ret[i] = one[i] + two[i];
        }
        
        return ret;
    }
    
}
