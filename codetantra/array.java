package codetantra;

public class array {
    public boolean elementfinder(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i==4) break;
            if(arr[i]==4) return true;
        }
        return false;
    }
    
}
