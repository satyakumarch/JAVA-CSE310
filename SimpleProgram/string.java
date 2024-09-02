import java.util.Scanner;

// public class string {
//     public static void main(String[] args) {
//         //string declaration
//         // String name="lovely professioanl university";
//         // String place="punjab india";
//         System.out.print("Enter your name:");
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         System.out.println("your name is:"+name);
    
// }
    
// }
// output
// Enter your name:lovely professioal university
// your name is:lovely professioal university

// public class string {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter your first name:");
//         String name=sc.nextLine();
//         System.out.print("Enter your second name:");
//         String address=sc.nextLine();
//         String fullname=name+" "+address;
//         //System.out.println("The lenght of name is: "+name.length());
//         System.out.println("your name is:"+fullname);
//         //length of string
//         System.out.println("The length of the string is:"+fullname.length());
//         //chartAt
//         for(int i=0;i<fullname.length();i++){
//             System.out.print(fullname.charAt(i));
//             System.out.println();
//         }
//         //compare string
//         if(name.compareTo(address)==0){
//             System.out.println("String are equal");

//         }else{
//             System.out.println("string are not equal");
//         }
// //substring
// System.out.println(name.substring(1,6));
// System.out.println(address.substring(3,8));

//         }
//     }
// output
// Enter your first name:satya
// Enter your second name:kumar
// your name is:satyakumar

// public class string{

//     public class elementcheck{
//         public boolean checkelement(int[] arr,int arg){
//             boolean res=false;
//             for(int i=0;i<arr.length-1;i++){
//                 if(arr[i]==arg || arr[i+1]==arg){
//                     res=true;
//                 }else{
//                     res=false;
//                     break;
//                 }
//             }
//             result res;
//         }
//     }
// }
public class string{
   public static void main(String[] args){
    int arr[] ;
    // public void checkelement(int [] arr)
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
            }
        
    }
   }
}