/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elementary.Programming;

/**
 *
 * @author ciaon
 */
public class Results {

    public static void main(String[] args) {
            int j = 0;
    int i = ++j + j * 5;

    System.out.println("What is i? " + i);
        double a = 6.5;
        a += a + 1;
        System.out.println("a is " + a);
        a = 6;
        a /= 2;
        System.out.println("a is " + a);
        int m = 5;
        int r = 20;
        double result = (int) 1.0 * m * (r * r);
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
        System.out.println(Math.pow(2, 3.5));
        System.out.println("result is " + result);
        
        /** By default, and integer literal is a decimal integer number. To denote a binary integer
            literal, use a leading 0b or 0B (zero B): to denote an octal literal, use a leading 0 (zero) 
            and to denote a hexadecimal integer literal, use a leading 0x or 0X (zero X). 
            For example.
            
          **/
            System.out.println(0B1111);
            System.out.println(07777);
            System.out.println(0XFFFF);
            
            /* Hexadecimal numbers, binary numbers, and octal numbers will be introduced in 
            Appendix F.   */
            
            
            // REPL stands for Read Evaluate Print Loop
            
           // System.out.println(4.0 / (3 * (r + 34)) - 9.0 * (a + b * c) + (3 + d * (2 + a)) / (a + b * d);
            //  System.out.println(5.5 * Math.pow(r + 2.5, 2.5 + t));
    }
}
