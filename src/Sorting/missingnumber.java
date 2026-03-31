package Sorting;

public class missingnumber {
        static void swap(int[]arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
        public static void main(String[] args) {
            int[] nums = {9,6,4,2,3,5,7,0,1};
            int i=0;
            while(i<nums.length){
                if(nums[i]<nums.length && nums[i]!=i){
                    swap(nums,i,nums[i]);
                }else {
                    i++;
                }
            }
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=j){
                    System.out.println(j);
                }
            }
            System.out.println(nums.length);
        }
    }

