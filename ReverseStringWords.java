import java.util.*;
public class ReverseStringWords {
    public String reverseString(String str){
        Stack stack= new Stack<String>();
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch==' '){
                stack.push(sb.toString());
                sb.setLength(0);
            }else{
                sb.append(ch);
            }
        }
        stack.push(sb.toString());//last word

        StringBuilder sb1= new StringBuilder();
        while(!stack.empty()){
            sb1.append(stack.pop());
            if(!stack.empty()){
                sb1.append(" ");
            }
        }
        return sb1.toString();
    }

    public static void main(String[] args){
        ReverseStringWords rstr= new ReverseStringWords();
        String res=rstr.reverseString("my name is sarthak");
        System.out.println(res);
    }
}
