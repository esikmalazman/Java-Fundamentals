/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 2* and open the template in the editor.
 */

package boiling.conditions.pkgif;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BoilingandFreezingConditionsIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please put the temperature");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >=100){
            System.out.println("The water is Boiling");
        } 
        if (temp <= 0){
                System.out.println("The water is Freezing");
        }
        if (0 < temp && temp <100 )
                {
                System.out.println("The water is normal statement");
        }
    }
    
}
