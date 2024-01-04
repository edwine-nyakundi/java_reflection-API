
import java.util.Arrays;

// Employee Class
class Employee{

  // Fields 
  int empId;
  String name;
  
  // Constructor
  Employee(int empId, String name){
    this.empId = empId;
    this.name = name;
  }
  
  // Method
  void showInfo() {
    System.out.println("Employee Id: "+empId);
    System.out.println("Employee Name: "+name);
  }
}

class Demo1{
  public static void main(String[] args) throws ClassNotFoundException {
    
    // Employee class
    Class name = Class.forName("myjavaproject.Employee");
    // Get class Name
    System.out.println(name.getName());
    // Get Package
    System.out.println(name.getPackageName());
    System.out.println(name.getTypeName());
    Arrays.stream(name.getDeclaredConstructors()).forEach(System.out::println);
    Arrays.stream(name.getDeclaredFields()).forEach(System.out::println);
    Arrays.stream(name.getDeclaredMethods()).forEach(System.out::println);
  }
} 
  