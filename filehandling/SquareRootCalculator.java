public class SquareRootCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        double ss=Math.sqrt(n);
        System.out.println("Square root : "+ss);
    }
}