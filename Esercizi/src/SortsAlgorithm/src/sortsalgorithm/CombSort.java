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
        double gap = arr.length;
        boolean sorted = false;
        
        while (!sorted) {
            gap /= 1.3;
            
            if (gap <= 1) {
                sorted = true;
                gap = 1;
            }
            
            for (int i = 0; i + gap < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    sorted = false;
                }
            }
        }
    }
    
    @Override
    public void run() {
        this.comb();
    }
    
    public static void combSort(int[] arr) {
        int temp = 0;
        double gap = arr.length;
        boolean sorted = false;
        
        while (!sorted) {
            gap /= 1.3;
            
            if (gap <= 1) {
                sorted = true;
                gap = 1;
            }
            
            for (int i = 0; i + gap < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    sorted = false;
                }
            }
        }
    }
    
    private int[] arr;
    private final double shrinFactor;
}
