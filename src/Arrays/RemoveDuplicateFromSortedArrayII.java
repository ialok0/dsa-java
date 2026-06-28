package Arrays;

/*
* this problem ask for remove duplicates but the element can't duplicate more than 2 times.
* input - [1,1,1,2,2,3,3] length = 7
* output - [1,1,2,2,3,3]  length = 6
* */

public class RemoveDuplicateFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(i<2 || nums[j]!=nums[i-2]){ //checks for which element duplicate more than 2 times
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
