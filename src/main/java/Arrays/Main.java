/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author ciaon
 */
public class Main {

    public static void main(String[] args) {

           
        double[] myList = {1, 2, 3, 4, 5, 6};
        for (int i = myList.length - 1; i > 0; i--) {
            // Generate an index j randomly 
            int j = (int) (Math.random() * (i + 1));

            // Swap myList[i] with myList[j]
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
    }
}
