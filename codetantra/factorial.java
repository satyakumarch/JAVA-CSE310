 package codetantra;

public class factorial {
public static void main(String[] args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int factorial=1;
    for(int i=0;i<=n;i++){
        factorial*=i;
    }
    System.out.println("factorial of"+n+" "+factorial);
}
    
}