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
    Worst-case performance	O(n²)
    Best-case performance	O(n)
    Worst-case space complexity	O(1)
 * @author alessandrogiaquinto
 */
public class OddEvenSort implements SorterAlgorithm{

    public OddEvenSort() {
    }

    public OddEvenSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int[] getArr() throws NullArrayException {
        if (this.arr == null) {
            throw new NullArrayException("Array it's NULL, you nedd to set it");
        }
        return arr;
    }

    @Override
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
    
    public void oddEven() {
        int temp = 0;
        boolean sorted = false;
        
        do {
            for (int i = 0; i < arr.length - 1; i+=2) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    sorted = true;
                }
            }
            
            if (!sorted) {
                break;
            }
            sorted = false;
            
            for (int i = 1; i < arr.length - 1; i+=2){
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    sorted = true;
                }
            }
        }while(!sorted);
    }
    
    @Override
    public void run() {
        this.oddEven();
    }
    
    public static void oddEvenSort(int[] arr) {
        int temp = 0;
        boolean sorted = false;
        
        do {
            for (int i = 0; i < arr.length - 1; i+=2) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    sorted = true;
                }
                U.debug("oddEvenSort",arr);
            }
            
            if (!sorted) {
                break;
            }
            sorted = false;
            
            for (int i = 1; i < arr.length - 1; i+=2){
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    sorted = true;
                }
                U.debug("oddEvenSort",arr);
            }
        }while(!sorted);
    }
    
    private int[] arr;
}

