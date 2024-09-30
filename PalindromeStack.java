import java.util.Stack;

public class PalindromeStack {
    public void checkPalindrome(String data){
        Stack<Character> s = new Stack<Character>();
        int len=data.length();
        for(int i=0;i<len;i++){
            s.push(data.charAt(i));
        }
        System.out.println("Data pushed..");
        int cnt=0;
        for(int i=0;i<len;i++){
            char a = s.pop();
            if(a==data.charAt(i)){
                cnt++;
            }
        }
        if(cnt==len){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome...");
        }
    }
    public static void main(String[] args) {
        PalindromeStack p = new PalindromeStack();
        p.checkPalindrome("hasdeh");
    }
}
