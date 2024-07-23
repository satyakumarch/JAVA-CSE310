public class Static_Keyword{
    public static void main(String[] args){
        Student s1=new Student();
        s1.schoolName="janchetana";

        Student s2=new Student();
        System.out.println(s2.schoolName);

    }
}
class Student{
    String name;
    int roll;

    static String schoolName;
    void SetName(String name){
        this.name=name;
    }
    String getName(String name){
        return this.name;
}
}