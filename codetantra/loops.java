package codetantra;

public class loops {

    public static void main(String[] args) {
        outerloop:
        for(int i=20;i<=25;i++){
            System.out.println("i="+i);
            Innerloop:
            for(int j=1;j<10;j++){
                if(i%2==0){
                    continue outerloop;
                    
                }
                if(j%3==0){
                    continue Innerloop;
                }
                System.out.print(j);
            }
        }
    }
}
