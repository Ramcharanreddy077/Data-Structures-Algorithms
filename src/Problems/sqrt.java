package Problems;

public class sqrt {
    public static void main(String[] args) {
        int n=36;
        int l=2;
        int r=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid*mid==n){
                System.out.println(mid);
            }
            if(mid*mid>n){
                r=mid-1;
            }else{
                l = mid + 1;
            }
        }
    }
}
