// class arrayexample{
//     void sumofarray(){
//         int[] arr={1,2,3,4,5};
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum=sum+arr[i];
//         }
//         System.out.println("The sum of the array element is : "+sum);
//     }
// }
// public class sum{
//     public static void main(String[] args){
//         arrayexample obj=new arrayexample();
//         obj.sumofarray();
//     }
// }
class arrayexample{
    void sumofarray(){
        int arr[]={1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.print("The sum of the array element is:"+sum);
    }
}
public class sum{
    public static void main(String[] args){
        arrayexample obj=new arrayexample();
        obj.sumofarray();
    }
}