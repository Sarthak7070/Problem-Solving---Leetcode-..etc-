import java.util.*;
public class RemoverDuplicateSortedArray {
    int removeDuplicate(int[] arr){
        HashSet<Integer> hs= new HashSet<>();
        for(int num : arr){
            hs.add(num);
        }
        int res[]= new int[hs.size()];
        int cnt=0;
        for(int num1: hs){
            res[cnt++]=num1;
        }
        return res.length;
    }
    public static void main(String[] args){
        RemoverDuplicateSortedArray rd= new RemoverDuplicateSortedArray();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result=rd.removeDuplicate(nums);
        System.out.println(result);
    }
}
