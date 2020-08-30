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
    Caso peggiore temporalmente	O(n²)
    Caso ottimo temporalmente	O(n)
    Caso medio temporalmente	O(n²)
    Caso peggiore spazialmente	O(n) totale, O(1) ausiliario
    Ottimale	No
 * @author alessandrogiaquinto
 */
public class BubbleSort implements SorterAlgorithm{

    public BubbleSort() {
    }

    public BubbleSort(int[] arr) {
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
    
    
    public void bubble() {
        int n = arr.length;
        int temp = 0;
        boolean swap = false;
        
        for (int i = 0; i < n; i++) {
            swap = false;
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap) { // Se non c'è stato scambio, hai finito
                break;
            }
        }
    }
    
    @Override
    public void run() {
        this.bubble();
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean swap = false;
        
        for (int i = 0; i < n; i++) {
            U.debug("bubbleSort",arr);
            swap = false;
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
                U.debug("bubbleSort",arr);
            }
            if (!swap) { // Se non c'è stato scambio, hai finito
                break;
            }
        }
    }
    
    private int[] arr;
}