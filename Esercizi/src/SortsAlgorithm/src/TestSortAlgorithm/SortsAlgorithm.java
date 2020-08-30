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
package TestSortAlgorithm;

import SortAlgorithmUtils.ArrayMaker;
import SortAlgorithmUtils.U;
import sortsalgorithm.SelectionSort;
import sortsalgorithm.*;

/**
 *
 * @author alessandrogiaquinto
 */
public class SortsAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = ArrayMaker.makeInt(10, 999);
        U.debugEnable = false;
        
        U.print("Print the new array");
        U.print(arr);
        
        
        U.print("SelectionSort");
        SelectionSort.selectionSort(arr);
        U.print(arr);
        
        another(arr, 10, 999);
        
        U.print("BubbleSort");
        BubbleSort.bubbleSort(arr);
        U.print(arr);
        
        another(arr, 10, 999);
        
        U.print("CocktailSort");
        CocktailSort.cocktailSort(arr);
        U.print(arr);
        
        another(arr, 10, 999);
        
        U.print("OddEven sort");
        OddEvenSort.oddEvenSort(arr);
        U.print(arr);
    }
    
    public static void another(int[] arr, int len, int randomSeed) {
        U.print("Make another array");
        arr = null;
        arr = ArrayMaker.makeInt(len, randomSeed);
        U.print(arr);
    }
    
}


