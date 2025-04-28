// class Power {
//     public static void main(String[] args) {
        
//       int base = 3, powerRaised = 4;
//       int result = power(base, powerRaised);
  
//       System.out.println(base + "^" + powerRaised + "=" + result);
//     }
  
//     public static int power(int base, int powerRaised) {
//       if (powerRaised != 0) {
  
//         // recursive call to power()
//         return (base * power(base, powerRaised - 1));
//       }
//       else {
//         return 1;
//       }
//     }
//   }
 import java.util.Scanner;
 public class Power{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Ente base number:");
    int base=sc.nextInt();
    System.out.print("Enter powerRaised number:");
    int powerRaised=sc.nextInt();

    int result=power(base,powerRaised);
    System.out.println(base+"^"+powerRaised+"="+result);
  }
  public static int power(int base,int powerRaised){
    if(powerRaised!=0){
      return (base*power(base,powerRaised-1));
    }else{
      return -1;
    }
  }
 }