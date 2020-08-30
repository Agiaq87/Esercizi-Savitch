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
package sortsalgorithm;

import SortAlgorithmUtils.U;

/**
    Selection Sort
    Caso peggiore temporalmente	O(n²)
    Caso ottimo temporalmente	O(n²)
    Caso medio temporalmente	O(n²)
    Caso peggiore spazialmente	O(n) totale
    O(1) ausiliario
    Ottimale	No
 * @author alessandrogiaquinto
 */
public class SelectionSort implements SorterAlgorithm{

    public SelectionSort() {
    }

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() throws NullArrayException {
        if (this.arr == null) {
            throw new NullArrayException("Array it's NULL, you nedd to set it");
        }
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
    
    public void selection() {
        var min = 0;
        var tempSwap = 0;
        
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++ ) {
                if ( arr [j] < arr [min] ) {
                    min = j;
                }
            }
            
            tempSwap = arr [i];
            arr[i] = arr[min];
            arr[min] = tempSwap;
        }
    }
    
    @Override
    public void run() {
        this.selection();
    }
    
    /**
     * For general use outside class
     * @param in 
     */
    public static void selectionSort(int[] in) {
        var min = 0;
        var tempSwap = 0;
        
        for (int i = 0; i < in.length; i++) {
            min = i;
            U.debug("selectionSort",in);
            for (int j = i+1; j < in.length; j++ ) {
                if ( in [j] < in [min] ) {
                    min = j;
                }
                U.debug("selectionSort",in);
            }
            
            tempSwap = in [i];
            in[i] = in[min];
            in[min] = tempSwap;
        }
    }
    
    private int[] arr;    
}
