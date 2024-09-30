import java.util.*;
public class StringCompression {
    StringBuilder sb = new StringBuilder();

    String compress(String str){
        int cnt=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                cnt++;
            }else{
                sb.append(str.charAt(i-1));
                sb.append(cnt);
                cnt=1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        sb.append(cnt);

        return str.length()>sb.toString().length() ? sb.toString() : str ;
    }

    public static void main(String[] args){
        StringCompression sc = new StringCompression();
        System.out.println(sc.compress("aaabbbbccdd"));

    }
}
