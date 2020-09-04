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
package ex6_7_4;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex6_7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] alaskanBands = new String[3][];
        
        String[] band1 = {"Portugal", "John Gourley", "Zachary carothers", "Noah gersh", "Kyle O'Quin", "Kane Ritchotte"};
        String[] band2 = {"36 Crazyfists", "Brock Lindow", "Steve Holt", "Mick Whitney", "Kyle Baltus"};
        String[] band3 = {"Historian", "Nathan Hurst", "Jason Lessard", "Daniel Zawodny", "Marc Bourdon"};
        
        alaskanBands[0] = band1;
        alaskanBands[1] = band2;
        alaskanBands[2] = band3;
        
        for (int i = 0; i < alaskanBands.length; i++) {
            for (int j = 0; j < alaskanBands[i].length; j++) {
                System.out.println(alaskanBands[i][j]);
            }
            System.out.println();
        }
        
        // Uso del for - loop:
        for (String[] alaskanBand1 : alaskanBands) {
            for (String alaskanBand : alaskanBand1) {
                System.out.println(alaskanBand);
            }
            System.out.println();
        }
    }
    
}
