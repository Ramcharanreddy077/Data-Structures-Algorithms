package Sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[]args){
        int[] arr={4,2,6,2,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

}
