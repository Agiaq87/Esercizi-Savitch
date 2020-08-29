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
package ex6_6_2;

import java.util.Scanner;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        var max = 0.0;
        int[] famiglieMinore;
        var countFamiglieMinore = 0;
        
        // Attenzione, NON SI DOVREBBE FARE MAI SENZA UN CHECK!!!!
        var arr = new int[s.nextInt()];
        
        for (int i = 0; i < arr.length; i++){
            System.out.println("Prego inserire ora il reddito");
            arr[i] = s.nextInt();
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        
        System.out.println(max);
        max/=10;
        
        for (int t: arr) {
            if (t <= max) {
                countFamiglieMinore++;
                System.out.println(t);
            }
        }
        
        System.out.println("Numero di famiglie trovato: " + countFamiglieMinore);
        
        
    }
    
    /**
     * 5
Prego inserire ora il reddito
1500
Prego inserire ora il reddito
100
Prego inserire ora il reddito
150
Prego inserire ora il reddito
200
Prego inserire ora il reddito
250
1500.0
100
150
Numero di famiglie trovato: 2
     */
}
