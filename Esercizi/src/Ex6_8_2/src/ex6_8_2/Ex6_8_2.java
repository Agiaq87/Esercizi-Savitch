/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_8_2;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserire una frase seguita da un punto:");
        String read = s.nextLine().toLowerCase().replaceAll(" ","").replaceAll("'", "");
        System.out.println(read);
        var temp = read.split(Pattern.quote("."));
        
        for (String t: temp){
            System.out.println("La string a valutata è: " + t + "\nPalindroma?" + palindroma(t));
        }
    }
    
    public static boolean palindroma(String string){
        int i = 1;
        
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            for (; i < string.length() - 1; i++){
                if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                    return false;
                }
            }
        }
        
        return i == string.length()-1;
    }
    
}
