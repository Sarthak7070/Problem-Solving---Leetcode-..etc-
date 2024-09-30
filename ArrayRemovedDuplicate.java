import java.util.*;
public class ArrayRemovedDuplicate {
    String[] removeDuplicate(String[] arr, String[] arr1){
        String[] res=new String[5];
        int cnt=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr.length;j++){
                if(!arr1[i].equals(arr[j])){
                    res[cnt]=arr1[i];
                    cnt++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        ArrayRemovedDuplicate rd= new ArrayRemovedDuplicate();
        String[] ar1={"pratik","aniket"};
        String[] ar2={"sarthak","pratik","aniket","mandar"};
        String[] result=rd.removeDuplicate(ar1, ar2);
        System.out.println(result);

    }
}
