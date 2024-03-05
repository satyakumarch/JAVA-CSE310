class Superclass {
    int age;
 
    Superclass(int age) {
       this.age = age; 		 
    }
 
    public void getAge() {
       System.out.println("The value of the variable named age in super class is: " +age);
    }
 }
 
 public class subclass extends Superclass {
    subclass(int age) {
       super(age);
    }
 
    public static void main(String args[]) {
       subclass s = new subclass(24);
       s.getAge();
    }
 }