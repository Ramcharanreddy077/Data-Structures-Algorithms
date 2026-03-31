package Bitmanipulation;

public class powoftwo {
    public static void main(String[] args) {
        int n=256;
        boolean ispower=(n&(n-1))==0;
        System.out.println(ispower);
    }
}
