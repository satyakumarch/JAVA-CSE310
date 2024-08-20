public class Course{
    static int maxCapacity;
    String courseName;
    int enrollments;
    Course(String courseName){
        this.courseName=courseName;
       this.enrollments=0;
       String[] enrolledStudents=new String[maxCapacity];

    }

    static void setMaxCapacity(int maxCapacity){
       Course.maxCapacity=maxCapacity; 
    }
    void enrolledStudents(String studentName){
        enrolledStudents[enrollments]=studentName;
        enrollments++;
    }
    void enrolledStudents(String)


}