/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;
import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer ");
        
        int n = input.nextInt();
        
        
        for (int i = 1; i <= n ; i++) {
            
            
            for(int j = 1; j <= n-i ; j++) 
                System.out.print(" ");
            
            
            for(int j = 1; j <=2*i -1; j++)
                if(i == n)
                System.out.print("*");
                else
                    if(j == 1 || j == 2*i- 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            
                
            
            
            System.out.println();
        }
        
        
    }
}
