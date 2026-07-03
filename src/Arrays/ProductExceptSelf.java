package Arrays;

import java.util.Arrays;

/*
* given an integer array nums and return the array.
* like res[i] is the product of all element except nums[i];
* */

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        int productOfAllBeforeCurrent = 1;
        int productOfAllAfterCurrent  = 1;

        for(int i=0; i<n; i++){
            res[i]=productOfAllBeforeCurrent;
            productOfAllBeforeCurrent *= nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(res));

        for (int i=n-1; i>=0; i--){
            res[i] *= productOfAllAfterCurrent;
            productOfAllAfterCurrent *= nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(res));
        return res;
    }
}
