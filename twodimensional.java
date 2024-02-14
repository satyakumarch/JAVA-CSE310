import java.util.Scanner;

// public class twodimensional {
//     public static void main(String[] args) {
//         System.out.println("Enter the number of rows and column:");
//         //System.out.println("Enter the number of column:");
//         Scanner sc=new Scanner(System.in);
//         int rows=sc.nextInt();
//         int cols=sc.nextInt();

//         int[][] number=new int[rows][cols];
// System.out.println("Enter the rows and column element:");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 number[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
               
//                 System.out.print(number[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
    
// }






// take a matrix as input from the user Search for a given number x and print
// the indices at which it occurs

public class twodimensional {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and column:");
        //System.out.println("Enter the number of column:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] number=new int[rows][cols];
System.out.println("Enter the rows and column element:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();
            }
        }
       int x=sc.nextInt();
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(number[i][j]==x){
                System.out.println("x found at location(" +i+ "," +j+ ")");
            }
        }
       }
        }
    }
    

