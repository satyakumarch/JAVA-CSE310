
    import java.util.Scanner;
public class primeExample {    
    public static void main(String args[]) {    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int n = scanner.nextInt(); // Read the input from the user
        scanner.close(); // Close the scanner to prevent resource leak
        
        int i, m = 0, flag = 0;      
        m = (int) Math.sqrt(n); // Calculate square root of n for optimization
        
        if (n == 0 || n == 1) {  
            System.out.println(n + " is not a prime number");      
        } else {  
            for (i = 2; i <= m; i++) {      
                if (n % i == 0) {      
                    System.out.println(n + " is not a prime number");      
                    flag = 1;      
                    break;      
                }      
            }      
            if (flag == 0) { 
                System.out.println(n + " is a prime number"); 
            }  
        }
    }    
}
