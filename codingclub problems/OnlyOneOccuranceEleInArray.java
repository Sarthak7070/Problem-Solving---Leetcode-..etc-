import java.util.*;
class OnlyOneOccuranceEleInArray {
    public static void main(String[] args) {
        int[] nums={2,2,3};
        HashMap<Integer,Integer> numbers= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numbers.put(nums[i],numbers.getOrDefault(nums[i],0)+1);
        }
        Iterator<Map.Entry<Integer,Integer>> iterator = numbers.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Integer> entry=iterator.next();
            if(numbers.get(entry.getKey()).equals(1)){
                System.out.println(entry.getKey());
            }
        }
    }
}
