import java.util.*;
public class FirstNonRepeating {
    public char firstNonRepeating(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : str.toCharArray()){
            if(map.get(ch)==1){
                return ch;
            }
        }
         return ' ';
    }

    public static void main(String[] args){
        FirstNonRepeating fr= new FirstNonRepeating();
        char ch = fr.firstNonRepeating("swiss");
        System.out.println(ch);
    }
}
