/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortsalgorithm;

/**
 * Like signature
 * @author alessandrogiaquinto
 */
public interface SorterAlgorithm extends Runnable {
    
    public int[] getArr() throws NullArrayException ;

    public void setArr(int[] arr) ;
    
    /**
     * The total of implemented sort algorithm
     */
    public static int numOf = 1;
}
