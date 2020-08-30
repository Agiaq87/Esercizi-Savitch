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
public class U {
    /**
     * Print String
     * @param t 
     */
    public static void print(String t) {
        System.out.println(t);
    }
    
    /**
     * Print array
     * @param arr 
     */
    public static void print(int[] arr) {
        for (int t: arr) {
            System.out.print(" " + t + ", "); 
        }
        System.out.print(" \n"); 
    }
    
    public static void debug(String functionName, int[] arr) {
        if (debugEnable) {
            System.err.println("INTO FUNCTION NAME " + functionName);
            for (int t: arr) {
                System.err.print(" " + t + ", "); 
            }
            System.err.print("END" + functionName + "\n"); 
        }
    }
    
    public static boolean debugEnable = true;
}
