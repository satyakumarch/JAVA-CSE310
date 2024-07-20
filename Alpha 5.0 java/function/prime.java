public class prime{
    public static boolean isPrime(int n){
        if(n==2){
            return true;

        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void primeinRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i))//true;
            System.out.print(i+" ");

        }

    }
    // public static boolean isPrime(int n){
    //     boolean isPrime=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){//completely divide
    //           return false;
    //         }
    //     }
    //     return true;
    // }
    public static void main(String[] args){
        // System.out.println(isPrime(3));
        // System.out.println(primeinRange(20));
        primeinRange(30);


    }
}