import java.util.*;
public class ReverseAraay{
    public int[] reverseAraay(int[] arr){
        int[] resArray=new int[arr.length];
        int i=0;
        int size=arr.length-1;
        while (size>=0) {
            resArray[i]=arr[size];
            size--;
            i++;
        }
        return resArray;
    }
    
    public static void main(String[] args){
        ReverseAraay rs= new ReverseAraay();
        int[] arr={1, 2, 3, 2, 1};
        int[] result=rs.reverseAraay(arr);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        if(Arrays.equals(result,arr)){
            System.out.println("plindrome");
        }
        else{
            System.out.println("not plindrome");
        }
    }
}