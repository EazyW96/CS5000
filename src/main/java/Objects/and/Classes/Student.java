/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects.and.Classes;

/**
 *
 * @author ciaon
 */
public class Student {
  private int id;
  private String name;
  private java.util.Date dateCreated;
  
  public Student(int ssn, String newName) {
    id = ssn;
    name = newName;
    dateCreated = new java.util.Date();
  }
  
  public int getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
 
  public java.util.Date getDateCreated() {
    return dateCreated;
  }
}