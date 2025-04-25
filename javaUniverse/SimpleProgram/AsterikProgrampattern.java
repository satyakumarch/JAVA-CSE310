public class AsterikProgrampattern { 
    public static void main(String[] args) { 
     for(int i=1;i<=10;i++) 
     { 
       for(int j=1;j<=i+i;j++)
       {
           int mid; 
           mid=j%i; 
           if(mid==0) 
               System.out.print("* "); 
           else 
               System.out.print("*");
       }
       System.out.print("\n");
       }
    }
   }