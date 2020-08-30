/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortsalgorithm;

import SortAlgorithmUtils.U;

/**
 * Worst-case performance	{\displaystyle O(n^{2})}O(n^{2})[1]
    Best-case performance	{\displaystyle \Theta (n\log n)}\Theta(n \log n)
    Average performance         {\displaystyle \Omega (n^{2}/2^{p})}\Omega(n^2/2^p), where p is the number of increments[1]
    Worst-case space complexity	{\displaystyle O(1)}O(1)
 * @author alessandrogiaquinto
 */
public class CombSort implements SorterAlgorithm{

    public CombSort() {
        this.shrinFactor = 1.3;
    }

    public CombSort(int[] arr) {
        this.shrinFactor = 1.3;
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

    public double getShrinFactor() {
        return shrinFactor;
    }
    
    public void comb() {
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
        this.comb();
    }
    
    public static void combSort(int[] arr) {
        int temp = 0;
        int gap = arr.length;
        double shrink = 1.3;
        boolean sorted = false;
        
        while (!sorted) {
            gap = Math.floorDiv(gap, shrink);
        }
    }
    
    private int[] arr;
    private final double shrinFactor;
}
