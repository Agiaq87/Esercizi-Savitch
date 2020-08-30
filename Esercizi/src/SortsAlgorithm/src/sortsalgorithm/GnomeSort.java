/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortsalgorithm;

import SortAlgorithmUtils.U;

/**
    Worst-case performance	{\displaystyle O(n^{2})}O(n^{2})
    Best-case performance	{\displaystyle O(n)}O(n)
    Average performance         {\displaystyle O(n^{2})}O(n^{2})
    Worst-case space complexity	{\displaystyle O(1)}O(1) auxiliary
 * @author alessandrogiaquinto
 */
public class GnomeSort implements SorterAlgorithm{

    public GnomeSort() {
    }

    public GnomeSort(int[] arr) {
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
    
    public void gnome() {
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
        this.gnome();
    }
    
    public static void gnomeSort(int[] arr) {
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
