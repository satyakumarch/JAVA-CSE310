public class Testr {

    public static void main(String args[]) {
       int x = 10;
 
       while( x < 20 ) {
          x++;
          if(x == 15){
             continue;		 
          }   
          System.out.print("value of x : " + x );
          System.out.print("\n");
       }
    }
 }