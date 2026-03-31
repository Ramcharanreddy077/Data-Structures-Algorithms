package Sorting;

import java.util.Arrays;

public class Bubblesort {
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    public static void main(String[]args){
        int arr[]={5,3,7,2,1};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
