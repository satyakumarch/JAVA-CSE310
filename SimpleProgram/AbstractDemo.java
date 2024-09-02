// public class AbstractDemo {

//     public static void main(String [] args) {
//        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
//        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
//        System.out.println("Call mailCheck using Salary reference --");
//        s.mailCheck();
//        System.out.println("\n Call mailCheck using Employee reference--");
//        e.mailCheck();
//     }
//  }
//  abstract class Employee {
//     private String name;
//     private String address;
//     private int number;
 
//     public Employee(String name, String address, int number) {
//        System.out.println("Constructing an Employee");
//        this.name = name;
//        this.address = address;
//        this.number = number;
//     }
    
//     public double computePay() {
//       System.out.println("Inside Employee computePay");
//       return 0.0;
//     }
    
//     public void mailCheck() {
//        System.out.println("Mailing a check to " + this.name + " " + this.address);
//     }
 
//     public String toString() {
//        return name + " " + address + " " + number;
//     }
 
//     public String getName() {
//        return name;
//     }
  
//     public String getAddress() {
//        return address;
//     }
    
//     public void setAddress(String newAddress) {
//        address = newAddress;
//     }
  
//     public int getNumber() {
//        return number;
//     }
//  }
//  class Salary extends Employee {
//     private double salary;   // Annual salary
    
//     public Salary(String name, String address, int number, double salary) {
//        super(name, address, number);
//        setSalary(salary);
//     }
    
//     public void mailCheck() {
//        System.out.println("Within mailCheck of Salary class ");
//        System.out.println("Mailing check to " + getName() + " with salary " + salary);
//     }
  
//     public double getSalary() {
//        return salary;
//     }
    
//     public void setSalary(double newSalary) {
//        if(newSalary >= 0.0) {
//           salary = newSalary;
//        }
//     }
    
//     public double computePay() {
//        System.out.println("Computing salary pay for " + getName());
//        return salary/52;
//     }
//  }


/* File name : AbstractDemo.java */
public class AbstractDemo {
    public static void main(String [] args) {
       Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
       System.out.println("salary: " + s.computePay());
    }
 }
 abstract class Employee {
    private String name;
    private String address;
    private int number;
 
    public Employee(String name, String address, int number) {
       System.out.println("Constructing an Employee");
       this.name = name;
       this.address = address;
       this.number = number;
    }
 
    public abstract double computePay();
       // Remainder of class definition
 
    public String getName() {
       return name;
    }
 
    public void setName(String name) {
       this.name = name;
    }
 
    public String getAddress() {
       return address;
    }
 
    public void setAddress(String address) {
       this.address = address;
    }
 
    public int getNumber() {
       return number;
    }
 
    public void setNumber(int number) {
       this.number = number;
    }
 }
 class Salary extends Employee {
    private double salary;   // Annual salary
 
    public Salary(String name, String address, int number, double salary) {
       super(name, address, number);
       this.salary = salary;
    }
 
    public double computePay() {
       System.out.println("Computing salary pay for " + getName());
       return salary/52;
    }
    // Remainder of class definition
 }