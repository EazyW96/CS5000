/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapt9_Objects.and.Classes;

/**
 *
 * @author ciaon
 */
public class TestStudent {
    public static void main(String[] args) {
    Student student = new Student(111223333, "Jamal");
    System.out.println("Student was created on " + student.getDateCreated());
    java.util.Date dateCreated = student.getDateCreated();
    dateCreated.setTime(200000); // Now dateCreated field is changed!
    System.out.println("Student's new time is " + student.getDateCreated());
  }
}
