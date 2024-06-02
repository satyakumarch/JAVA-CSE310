public class ram{
    public int sum(int n1,int n2){
        return n1+n2;
    }
    public static void main(String[] args){
        ram example =new ram();
        int n1=40;
        int n2=30;
        int n3=20;
        int result=example.sum(n1,n2,n3);
        System.out.println("result "+result);
    }
    
}