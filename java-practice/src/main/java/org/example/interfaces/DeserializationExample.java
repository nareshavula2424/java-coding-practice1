package org.example.interfaces;

import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obj= new ObjectInputStream(new FileInputStream("EmployeeData.txt"));
        Employee emp = (Employee) obj.readObject();
        System.out.println("Employee Name: " + emp.empName +", Employee ID: " +emp.empId +", Employee Salary: " +emp.empSalary+", Employee Dept: " +emp.empDept );
        obj.close();
    }
}
