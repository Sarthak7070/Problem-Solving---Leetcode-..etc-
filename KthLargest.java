import java.util.*;
public class KthLargest {
    public int kthLargest(int[] arr, int k){
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int num : arr){
            minheap.add(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        return minheap.peek();
    }
    public static void main(String[] args){
        KthLargest kl= new KthLargest();
        int[] arr= {1,56,85,34,67,78};
        System.out.println(kl.kthLargest(arr, 3));
    }
}
