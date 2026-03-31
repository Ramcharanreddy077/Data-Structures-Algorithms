package Bitmanipulation;

public class Magicnum {
    public static void main(String[] args) {
        int n=5;
        int ans=0;
        int base=5;
        while(n>0){
            int lastdigit=n&1;
            n=n>>1;
            ans+=lastdigit*base;
            base=base*5;
        }
        System.out.println(ans);
    }
}
