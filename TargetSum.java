import java.util.*;
public class TargetSum {
    public int[] targetSumIndices(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    int[] res={i,j};
                    return res;
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        TargetSum ts= new TargetSum();
        int[] arr={2,6,5,8,11};
        int[] result=ts.targetSumIndices(arr, 14);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
