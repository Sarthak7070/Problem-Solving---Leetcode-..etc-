import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        //amstrong number
        int num = 1234;
        int pow=0;
        List<Integer> nums = new ArrayList<Integer>();
        int r;
        while(num>0){
            r=num%10;
            nums.add(r);
            num=num/10;
            pow++;
        }
        int temp=1;
        int res=0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<pow;j++){
                temp=temp*nums.get(i);
            }
            res=res+temp;
            temp=1;
        }
        System.out.println(res);
        
    }
}
