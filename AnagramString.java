import java.util.*;
public class AnagramString {
    boolean isAnagram(String str1,String str2){
        HashMap<Character,Integer> map =  new HashMap<>();
        for(char ch : str1.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch1 : str2.toCharArray()){
            if(!map.containsKey(ch1)){
                return false;
            }
            map.put(ch1,map.get(ch1)-1);
            if(map.get(ch1)==0){
                map.remove(ch1);
            }
        }       
        return map.isEmpty();
    }

    public static void main(String[] args){
        AnagramString as = new AnagramString();
        boolean res=as.isAnagram("assnn", "nsasn");
        System.out.println(res);
    }
}
