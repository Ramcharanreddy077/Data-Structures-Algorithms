package Sorting;

class Cyclicsort {
    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int i = 0;
        while (i < nums.length ) {
            int correct = nums[i] - 1;
            if (nums[i]>0 &&nums[i]<=nums.length && nums[i]!=nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j) {
                System.out.println(j + 1);
                break;
            }
        }
//        System.out.println(-1);
    }
}