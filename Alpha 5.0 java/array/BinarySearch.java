
// pseudo code
// start=0,end=n-1;
// while(start<=end)
// find mid
// compare mid and key
// mid==key(found)
// mid>key(left)
// mid<key(right)

import java.util.*;
public class BinarySearch{

    //always occurred in sorted order or ascending order
    public static int binarysearch(int numbers[],int key){
        int start=0,end=numbers.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            //compare
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){//right
                start=mid+1;
            }else{//left
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int numbers[]={2,4,6,8,10,12,14};
        int key=14;
        System.out.println("index for the key is:"+binarysearch(numbers,key));
        
    }
}