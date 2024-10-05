
class HelloWorld {
    public static void main(String[] args) {
        int num=1234321;
        int temp=num;
        int r,sum=0;
        
        while(num>0){
            //remainder
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        
        if(temp==sum){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");   
        }
    }
}
