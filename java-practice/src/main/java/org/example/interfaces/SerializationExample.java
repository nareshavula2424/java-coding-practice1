package org.example.interfaces;

import java.io.*;

class Employee implements Serializable{
    int empId;
    String empName;
    double empSalary;
    String empDept;

    Employee(int empId,String empName,double empSalary,String empDept){
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;
        this.empDept=empDept;
    }
}
public class SerializationExample {
    public static void main(String[] args) throws IOException {

        Employee employee = new Employee(1001,"Naresh Avula",25000,"IT");
        FileOutputStream fileOutputStream = new FileOutputStream("EmployeeData.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        System.out.println("object converted into byte and stored in the file");

    }
}
