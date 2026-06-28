package Arrays;

/*
* it is ask for the remove duplicates and return the index after remove duplicates.
* */
public class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1; j<nums.length; j++){
            //check for the duplicates
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                // i shows number of unique element in the array.
                i++;
            }
        }
        return i+1;
    }
}
