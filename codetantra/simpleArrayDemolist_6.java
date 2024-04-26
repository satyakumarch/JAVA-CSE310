import java.util.*;
public class simpleArrayDemolist_6{
    public static void main(String[] args){
        List<String> namesList=new ArrayList<String>();
        namesList.add("satya");
        namesList.add("shivam");
        namesList.add("avinanadan");
        for(String name:namesList){
            System.out.println(name.substring(0,3));
        }
        
    }
}