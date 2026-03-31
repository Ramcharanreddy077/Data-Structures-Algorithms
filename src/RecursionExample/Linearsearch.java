package RecursionExample;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr={2,5,7,7,4,8};
        System.out.println(searchlast(arr,7,arr.length-1));
        System.out.println(searchfirst(arr,7,0));
    }
    //from first
    static int searchfirst(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchfirst(arr,target,index+1);
    }
    //from last
    static int searchlast(int[] arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchlast(arr,target,index-1);
    }
}
