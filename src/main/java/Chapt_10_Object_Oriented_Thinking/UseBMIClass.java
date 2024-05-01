 package Chapt_10_Object_Oriented_Thinking;

/**
 *
 * @author ciaon
 */

public class UseBMIClass {
	public static void main(String[] args) {
		BMI bmi1 = new BMI("Elliotte wideman", 33, 200, 74);
		System.out.println("The BMI for " + bmi1.getName() + " is " 
				+ bmi1.getBMI() + " " + bmi1.getStatus());
		
		BMI bmi2 = new BMI("Peter King ",  215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is " 
				+ bmi2.getBMI() + " " + bmi2.getStatus());
	}

}

