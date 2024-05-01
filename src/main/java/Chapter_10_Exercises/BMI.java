/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10_Exercises;

/**
 *
 * @author ciaon
 */
public class BMI {

	private String name;
	private int age;
	private double weight; // in pounds
	private double height; // in inches
	
	private static final double KILOGRAMS_PER_POUND = 0.45359237;
	private static final double METERS_PER_INCH = 0.0254;
	
	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}
	
	// New constructor to accept height in feet and inches
	public BMI(String name, int age, double weight, double feet, double inches) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = (feet * 12) + inches; // Convert feet to inches and add inches
	}
	
	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND / 
				((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		return Math.round(bmi * 100) / 100.0;
	}
	
	public String getStatus() {
		double bmi = getBMI();
		
		if (bmi < 16) 
			return "seriously underweight!";
		else if (bmi < 18)
			return "underweight!";
		else if (bmi < 24)
			return "normal weight";
		else if (bmi < 29)
			return "overweight";
		else if (bmi < 35)
			return "seriously overweight";
		else
			return "gravely overweight";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
}

