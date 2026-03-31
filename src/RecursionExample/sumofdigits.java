package RecursionExample;

public class sumofdigits {
    public static void main(String[] args) {
        int ans=sumdigit(4582);
        System.out.println(ans);
    }
    static int sumdigit(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem+sumdigit(n/10);
    }
}
