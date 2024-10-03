import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr ={2,3,1,4,5};
        Arrays.sort(arr);
        int maxsum=arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
        
        System.out.println(maxsum);
    }
}
