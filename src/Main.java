import Arrays.*;
import Strings.*;

public class Main {
    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;
//        MergeSortedArray mergeSortedArray = new MergeSortedArray();
//        mergeSortedArray.merge(nums1,m,nums2,n);

        int[] arr = {3,1,2,4,0,1,3,2};
        WaterTrapping waterTrapping = new WaterTrapping();
        System.out.println(waterTrapping.trap(arr));
    }
}