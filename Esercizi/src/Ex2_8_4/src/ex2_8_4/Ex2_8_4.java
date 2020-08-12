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
package ex2_8_4;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex2_8_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Il tuo colore preferito:");
        
        String color = tastiera.nextLine();
        
        System.out.println("Il tuo piatto preferito:");
        
        String food = tastiera.nextLine();
        
        System.out.println("Il tuo animale preferito:");
        
        String animal = tastiera.nextLine();
        
        System.out.println("Il nome del tuo amico preferito:");
        
        String friend = tastiera.nextLine();
        
        System.out.println("Ho sognato che " + friend + " aveva mangiato un " + animal + " " + color + " e aveva detto che sapeva di " + food);
    }
    
}
