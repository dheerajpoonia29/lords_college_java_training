package org.example.module_3.encapsulation;

public class Employee {
    public String name;
    // empId has private access modifier, so it accessible only within this class
    private int empId;

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        privateMethod();
    }

    public void setEmpId(int id) {
        this.empId = id;
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}
