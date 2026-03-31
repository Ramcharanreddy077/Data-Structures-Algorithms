package Sorting;

import java.util.Arrays;

public class Selectionsort {
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    static int max(int[] arr, int end){
        int maxval= 0;
        for(int i = 0; i<end; i++){
            if(arr[maxval]<arr[i]){
                maxval=i;
            }
        }
        return maxval;
    }
    public static void main(String[]args){
        int[] arr={2,4,1,6,3};
        for(int i=0;i<arr.length;i++) {
         int last=arr.length-i-1;
         int maxindex=max(arr, last);
         swap(arr,maxindex,last);
        }
        System.out.println(Arrays.toString(arr));
    }
}
