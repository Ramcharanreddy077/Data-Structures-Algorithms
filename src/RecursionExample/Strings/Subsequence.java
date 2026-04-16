package RecursionExample.Strings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String s="abcd";
        Subseq("",s);
//        System.out.println(SubseqList("",s));
//        System.out.println(SubseqListAscii("",s));

    }
    static void Subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        Subseq(p+ch,up.substring(1));
        Subseq(p,up.substring(1));

    }

    static ArrayList<String> SubseqList(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=SubseqList(p+ch,up.substring(1));
        ArrayList<String> right=SubseqList(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static ArrayList<String> SubseqListAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> first=SubseqListAscii(p+ch,up.substring(1));
        ArrayList<String> second=SubseqListAscii(p,up.substring(1));
        ArrayList<String> third=SubseqListAscii(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
