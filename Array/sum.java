class arrayexample{
    void sumofarray(){
        int[] arr={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
public class sum{
    public static void main(String[] args){
        arrayexample obj=new arrayexample();
        obj.sumofarray();
    }
}