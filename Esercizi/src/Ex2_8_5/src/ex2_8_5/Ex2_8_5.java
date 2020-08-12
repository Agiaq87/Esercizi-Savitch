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
package ex2_8_5;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex2_8_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Scrivi il prezzo del prodotto\n(da 25 centesimi a un Euro, con incrementi di 5 centesimi:");
        
        int price = tastiera.nextInt();
        
        System.out.println("Hai comprato un prodotto da " + price + " inserendo un Euro,\n il tuo resto è:");
        
        int temp = price / 50;
        
        System.out.println(temp + " monete di 50 cent,");
        
        price %= 50;
        
        temp = price / 20;
        
        System.out.println(temp + " monete di 20 cent,");
        
        price %= 20;
        
        temp = price / 10;
        
        System.out.println(temp + " monete di 10 cent,");
        
        price %= 10;
        
        System.out.println(price/5 + " monete di 5 cent,");
        
    }
    
}
