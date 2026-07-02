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

        RandomizeSet randomizeSet = new RandomizeSet();
        System.out.println("insert->"+randomizeSet.insert(5));
        System.out.println("insert->"+randomizeSet.insert(4));
        System.out.println("remove->"+randomizeSet.remove(9));
        System.out.println("insert->"+randomizeSet.insert(6));
        System.out.println("random->"+randomizeSet.getRandom());
    }
}