import java.util.Scanner;
public class Student{
    private int roll;
    private String name;
    private int phone;
    private double salary;

    public Student(int roll,String name, int phone, double salary){
        this.roll=roll;
        this.name=name;
        this.phone=phone;
        this.salary=salary;
    }
    public void displayInfo(){
        System.out.println("Student information");
        System.out.println("Roll on of the student:"+this.roll);
        System.out.println("Name of the student is:"+this.name);
        System.out.println("Phone no of the sudent is:"+this.phone);
        System.out.println("salary of the student is:"+this.salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roll no:");
        int roll = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
    
        System.out.println("Enter the name:");
        String name = sc.nextLine();
    
        System.out.print("Enter the phone:");
        int phone = sc.nextInt();
    
        System.out.print("Enter the salary:");
        double salary = sc.nextDouble();
    
        Student student = new Student(roll, name, phone, salary);
        student.displayInfo();
        sc.close(); // Close the scanner
    }
}



       