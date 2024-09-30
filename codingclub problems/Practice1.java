import java.util.*;

public class Practice1 {
    public static void main(String [] args){
        int[] arr= {5,10,40,30,20};
        HashMap<Integer,Integer> arrmap= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            arrmap.put(arr[i], i);
        }
        int[] result= new int[arr.length];
        int cnt=0;
        for(int num : arrmap.values()){
            result[cnt++]=num;
        }
        for(int j=0;j<result.length;j++){
            System.out.print(result[j]+" ");
        }
    }
}
