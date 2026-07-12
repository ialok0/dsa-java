import Arrays.*;
import Strings.*;
import TwoPointer.ContainerWithMostWater;
import TwoPointer.IsSubsequence;
import TwoPointer.ThreeSum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;
//        MergeSortedArray mergeSortedArray = new MergeSortedArray();
//        mergeSortedArray.merge(nums1,m,nums2,n);

        int[] arr = {-1,0,1,2,-1,-4};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result =  threeSum.threeSum(arr);
        for(List<Integer> triplet:result){
            for(int num : triplet){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}