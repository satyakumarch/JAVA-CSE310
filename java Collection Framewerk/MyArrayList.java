import java.util.List;
import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("avunanadan");
        l.add("shivan");
        l.add("avinash");
        l.add("gaurav");
        l.add("satya");
        l.add("shuivum");
        l.add("pawan");
        l.add("sahil");
        System.out.println("List objects are: " + l);
        l.remove("satya");
        System.out.println("After removing Satya, List objects are: " + l);
    }
}
