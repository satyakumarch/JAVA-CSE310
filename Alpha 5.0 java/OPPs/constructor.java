public class constructor{
    public static void main(String[] args){
        Student s1=new Student("satya");
        System.out.println(s1.name);



    }
}
class Student{
    String name;
    int roll;

    Student(String name){
        this.name=name;
        System.out.println("constructor is called");
    }
}