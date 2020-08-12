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
package ex2_6_4;

/**
 *
 * @author alessandrogiaquinto
 */
public class Ex2_6_4 {
    public static void main(String[] args) {
        int u = 2, v = 3, w = 5, x = 7, y = 11;
        
        System.out.printf("u + v * w + x = %d\n", ( u + v * v + x ));
        System.out.printf("u + y (rest) v * w + x = %d\n", ( u + y % v * w + x ));
        System.out.printf("u++ / v + u++ * v = %d\n", ( u++ / v + u++ * v ));
    }
    
}
