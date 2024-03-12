public class StringEx1 {
    public static void main(String[] args) {
        String str_Sample = "Java String endsWith example";
        //Check if ends with a particular sequence
        System.out.println("EndsWith character 'e': " + str_Sample.endsWith("e"));
        System.out.println("EndsWith character 'ple': " + str_Sample.endsWith("ple"));
        System.out.println("EndsWith character 'Java': " + str_Sample.endsWith("Java"));
    }
}