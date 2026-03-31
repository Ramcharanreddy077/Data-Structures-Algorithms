package Problems;

public class primenum {
    public static void main(String[] args) {
    int n=17;
    for(int i=1;i<=n;i++){
        System.out.println(i+" "+isprime(i));
    }
//        System.out.println(isprime(n));
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int start=2;
        while(start*start<=n){
            if(n%start==0){
                return false;
            }
            start++;
        }
        return true;
    }
}
