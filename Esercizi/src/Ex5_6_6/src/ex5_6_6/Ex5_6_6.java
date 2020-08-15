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
package ex5_6_6;

import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex5_6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String first, second;
        
        do{
            System.out.println("Inserisci la prima stringa:");
            first = tastiera.nextLine();
            System.out.println("Inserisci la seconda stringa:");
            second = tastiera.nextLine();
            
            if (first.length() == second.length()){
                System.out.println("Risultato del metodo: " + Ex5_6_6.trova(first, second.charAt(0)));
            }else{
                System.out.println("Risultato del metodo: " + Ex5_6_6.trova(second, first.charAt(first.length()-1)));
            }
                       
            
            System.out.println("Premere 'c' per ripetere, 'e' per uscire");
        }while(tastiera.nextLine().equalsIgnoreCase("c"));
        
        
    }
    
    public static boolean trova(String control, char searched){
        for (int i = 0; i < control.length(); i++){
            if (control.charAt(i) == searched){
                return true;
            }
        }
        
        return false;
    }
    
}
