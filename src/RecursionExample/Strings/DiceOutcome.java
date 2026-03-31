package RecursionExample.Strings;

import java.util.ArrayList;

public class DiceOutcome {
    public static void main(String[] args) {
//        diceoutcome("",5);
        System.out.println(diceoutcomeList("",5).size());
        System.out.println(diceoutcomecount("",5));
    }
    static void diceoutcome(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6&&i<=target ; i++) {
            diceoutcome(p+i,target-i);
        }
    }

    static ArrayList<String> diceoutcomeList(String p, int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 1; i <=6&&i<=target ; i++) {
            ans.addAll(diceoutcomeList(p+i,target-i));
        }
        return ans;
    }
    static int diceoutcomecount(String p,int target){
        if(target==0){
            return 1;
        }
        int count=0;
        for (int i = 1; i <=6&&i<=target ; i++) {
           count=count+ diceoutcomecount(p+i,target-i);
        }
        return count;
    }
}
