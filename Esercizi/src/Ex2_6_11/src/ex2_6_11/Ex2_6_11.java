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
package ex2_6_11;


import java.util.Scanner;
/**
 *
 * @author alessandrogiaquinto
 */
public class Ex2_6_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Inserisci una stringa.");
        
        int n = tastiera.nextInt();
        String s = tastiera.next();
        
        System.out.println("n e' " + n);
        System.out.println("s e' " + s);
        
        /*
        Inserisci una stringa.
2e'l'input
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at ex2_6_11.Ex2_6_11.main(Ex2_6_11.java:33)
        */
    }
    
}
