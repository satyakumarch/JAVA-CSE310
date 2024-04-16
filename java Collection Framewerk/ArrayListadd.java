import java.util.*;
public class ArrayListadd{
    public static void main(String[] args){
        ArrayList <String> fruit=new ArrayList<String>();
        fruit.add("mango");
        fruit.add("banana");
        fruit.add("gauva");
        fruit.add("orange");
        System.out.println("The fruits before removing:"+fruit);
        fruit.remove("banana");
        System.out.println("After removing the banana:"+fruit);
        fruit.remove(1);
        System.out.println("After removing from index:"+fruit);
    }
}