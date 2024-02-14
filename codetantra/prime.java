package codetantra;

public class prime {
    public void primenumber(int low,int high){
        for(int i=low;i<high;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
