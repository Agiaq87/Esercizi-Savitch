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
    Worst-case performance	O(n2)
    Best-case performance	O(n log n) (simple partition) or O(n) (three-way partition and equal keys)
    Average performance         O(n log n)
    Worst-case space complexity	O(n) auxiliary (naive) O(log n) auxiliary
 * @author alessandrogiaquinto
 */
public class QuickSort implements SorterAlgorithm{

    public QuickSort() {
    }

    public QuickSort(int[] arr) {
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
    
    public void quick() {
        int temp = 0;
        int pos = 1;
        
        while (pos < arr.length - 1){
            while (pos > 0 && arr[pos] > arr[pos +1]) {
                temp = arr[pos+1];
                arr[pos+1] = arr[pos];
                arr[pos] = temp;
                pos--;
            }
            pos++;
        }
    }
    
    @Override
    public void run() {
        this.quick();
    }
    
    public static void quickSort(int[] arr) {
        int temp = 0;
        int pos = 0;
        
        while (pos < arr.length - 1){
            while (pos >= 0 && arr[pos] > arr[pos +1]) {
                temp = arr[pos+1];
                arr[pos+1] = arr[pos];
                arr[pos] = temp;
                pos--;
            }
            pos++;
        }
    }
    
    private int[] arr;
}
