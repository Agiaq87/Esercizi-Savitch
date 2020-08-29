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
package ex6_6_4;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var telephone = new int[10];
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserire il numero di telefono:");
        String temp = s.nextLine();
        
        for (char c: temp.toCharArray()) {
            switch (c) {
                case '1' -> {
                    telephone[1]++;
                }
                case '2' -> {
                    telephone[2]++;
                }
                case '3' -> {
                    telephone[3]++;
                }
                case '4' -> {
                    telephone[4]++;
                }
                case '5' -> {
                    telephone[5]++;
                }
                case '6' -> {
                    telephone[6]++;
                }
                case '7' -> {
                    telephone[7]++;
                }
                case '8' -> {
                    telephone[8]++;
                }
                case '9' -> {
                    telephone[9]++;
                }
                default -> {
                    telephone[0]++;
                }
            }
        }
        
        for (int i = 0; i < telephone.length; i++) {
            System.out.println("[" + i + "] -> " + telephone[i]);
        }
        
    }
    
}
