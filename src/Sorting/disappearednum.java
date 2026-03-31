package Sorting;

import java.util.*;
public class disappearednum {
    static void swap(int[] arr,int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] nums={4,3,2,7,9,2,3,1};
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]-1){
                ans.add(j+1);
            }
        }
        System.out.println(ans);
        
    }
}



