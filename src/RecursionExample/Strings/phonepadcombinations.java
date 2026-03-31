package RecursionExample.Strings;
import java.util.*;
public class phonepadcombinations {
    public static void main(String[] args) {
    phonepad("","12");
    System.out.println(phonepadList("","12"));
    }
    static void phonepad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch=(char)('a'+i);
            phonepad(p+ch,up.substring(1));
        }
    }
    static List<String> phonepadList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int val=up.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
        for(int i=(val-1)*3;i<val*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(phonepadList(ch+p,up.substring(1)));
        }
        return ans;
    }
}
