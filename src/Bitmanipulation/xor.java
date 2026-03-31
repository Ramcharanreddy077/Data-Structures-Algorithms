package Bitmanipulation;

public class xor {
    public static void main(String[] args) {
        int a=2;
       System.out.println(xorcase(a));
    }

    public static int xorcase(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        return 0;
    }
}
