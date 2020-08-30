/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortAlgorithmUtils;

/**
 *
 * @author alessandrogiaquinto
 */
public class ArrayMaker {
    
    /**
     * Make new array of int
     * @param length
     * @param randomSeed
     * @return int[] arr
     */
    public static int[] makeInt(int length, int randomSeed) {
        var temp = new int[length];
        
        for (int i = 0; i < length; i++) {
            temp[i] = (int) (Math.random() * randomSeed);
        }
        
        return temp;
    }
}
