/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
