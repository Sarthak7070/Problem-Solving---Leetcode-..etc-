import java.util.*;

import javax.lang.model.type.IntersectionType;
public class IntersectionOfArrays {
    int[] intersection(int[] arr1, int[] arr2){
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs1.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(hs1.contains(arr2[j])){
                hs2.add(arr2[j]);
            }
        }
        int[] res = new int[hs2.size()];
        int index=0;
        for(int num : hs2){
            res[index++]=num;
        }
        return res;
    }

    public static void main(String[] args){
        IntersectionOfArrays ia = new IntersectionOfArrays();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result=ia.intersection(nums1, nums2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
