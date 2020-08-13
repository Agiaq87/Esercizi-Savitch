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
package ex3_6_2;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex3_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserire il primo numero:");
        
        int a = tastiera.nextInt();
        
        System.out.println("Inserire il secondo numero:");
        
        int b = tastiera.nextInt();
        
        System.out.println("Inserire il terzo numero:");
        
        int c = tastiera.nextInt();
        
        if (a>b){
            if (a>c){
                System.out.printf("Il numero più grande è a: %d\n", a);
            } else {
                System.out.printf("Il numero più grande è c: %d\n", c);
            }
        } else {
            if (b>c){
                System.out.printf("Il numero più grande è b: %d\n", b);
            } else {
                System.out.printf("Il numero più grande è c: %d\n", c);
            }
        }
    }
    
}
