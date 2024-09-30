import java.util.*;
public class RotateArrayByKElem {
    public int[] rotateArray(int[] arr,int k){
        int[] res=new int[arr.length];
        int startIndex=arr.length-k;
        int j=0;
        for(int i=0;i<res.length;i++){
            if(startIndex<arr.length){
            res[i]=arr[startIndex];
            startIndex++;
            }else{
                if(j<startIndex){
                res[i]=arr[j];
                j++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        RotateArrayByKElem ra= new RotateArrayByKElem();
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        int[] result=ra.rotateArray(arr, 3);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
