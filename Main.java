package com.preethi.emp;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        EmployeeInterface dao=new EmployeeImp();
        System.out.println("Welcome to Employee Management Application");
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1.Add Employee\n"+
                    "2.Show All Employees \n"+
                    "3.Show Employee Based on ID\n"+
                    "4.Update Employee Details\n"+
                    "5.Delete Employees\n");
            System.out.println("Enter your choice ");
            int ch=sc.nextInt();
            switch(ch) {
                case 1:
                    Employee emp=new Employee();
                    System.out.println("Enter ID : ");
                    int id=sc.nextInt();
                    System.out.println("Enter Name : ");
                    String name=sc.next();
                    System.out.println("Enter Salary : ");
                    double salary=sc.nextDouble();
                    System.out.println("Enter Age : ");
                    int age=sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setAge(age);
                    emp.setSalary(salary);
                    dao.createEmployee(emp);
                    break;
                case 2:
                    dao.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter id to show the details ");
                    int empid=sc.nextInt();
                    dao.showEmployeeBasedOnId(empid);
                    break;
                case 4:
                    System.out.println("Enter id to update the details");
                    int empid1=sc.nextInt();
                    System.out.println("Enter the new name");
                    name=sc.next();
                    dao.updateEmployee(empid1,name);
                    break;
                case 5:
                    System.out.println("Enter the id to delete");
                    int empid2=sc.nextInt();
                    dao.deleteEmployee(empid2);
                    break;
                case 6:
                    System.out.println("Have a good day");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice !");


            }
        }while(true);

    }
}
