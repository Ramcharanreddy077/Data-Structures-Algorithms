package Problems;

import java.util.ArrayList;

public class factorsofnum {
    public static void main(String[] args) {
        factor2(36);

    }
    //time complexity is O(n)
    static void factor1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    //time:O(sqrt(n)) & space:O(sqrt(n))
    static void factor2(int n){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i);
                }else{
                    System.out.println(i);
                    al.add(n/i);
                }
            }
        }
        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
       }
    }

}
