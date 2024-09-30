import java.util.*;
public class NumberOccuranceIndexes {
    Map occuranceIndexes(int[] nums){
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        return map;
    }
    public static void main(String[] args){
        NumberOccuranceIndexes ni = new NumberOccuranceIndexes();
        Map result=ni.occuranceIndexes(new int[]{1,1,2,3,1,2,3});
        System.out.println(result);
    }
}
