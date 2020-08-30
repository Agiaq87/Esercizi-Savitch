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
package sortalgoritms;

/**
 *
 * @author alessandrogiaquinto
 */
public class SortAlgoritms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[100];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  (int) Math.round(Math.random() * 999) ;
            
            System.out.println(arr[i]);
        }
        
        selection(arr);
        
        for (int t: arr) {
            System.out.print(t + ",");
        }
    }
    
    
    /*
    Caso peggiore temporalmente	O(n²)
    Caso ottimo temporalmente	O(n²)
    Caso medio temporalmente	O(n²)
    Caso peggiore spazialmente	O(n) totale
    O(1) ausiliario
    Ottimale	No
    */
    public static void selection(int[] in) {
        var min = 0;
        var tempSwap = 0;
        
        for (int i = 0; i < in.length; i++) {
            
            min = i;
            
            for (int j = i+1; j < in.length; j++ ) {
                if ( in [j] < in [min] ) {
                    min = j;
                }
            }
            
            tempSwap = in [i];
            in[i] = in[min];
            in[min] = tempSwap;
        }
    }
    
    /*
    Caso peggiore temporalmente	O(n²)
    Caso ottimo temporalmente	O(n)
    Caso medio temporalmente	O(n²)
    Caso peggiore spazialmente	O(n)
    Ottimale	No
    */
    public static void bubble(int[] in) {
        
    }
    
}
