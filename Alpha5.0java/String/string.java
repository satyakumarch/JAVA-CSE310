import java.util.*;
public class string{
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+"");
        }
        System.out.println();

    }
    public static void main(String[] args){
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2=new String("xyz");

        //string are immutable
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);

        // String fullname="satya kumar";
        // System.out.println(fullname.length());

        //concatination
        String firstname="satya kumar ";
        String lastname="chaudhary";
        String fullname=firstname+lastname;
        System.out.println(fullname.charAt(3));
        printletter(fullname);


    }
}