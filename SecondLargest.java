import java.util.*;
public class SecondLargest {
    public int secondLargest(int[] arr){
        int largest=0;
        int secondLargest=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                temp=largest;
                largest=arr[i];
                secondLargest=temp;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args){
        SecondLargest sl= new SecondLargest();
        int[] arr={3,2,3,1,2,4,5,5,6,11};
        int res=sl.secondLargest(arr);
        System.out.println(res);
    }
}
