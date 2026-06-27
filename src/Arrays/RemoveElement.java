package Arrays;

//Input: nums = [3,2,2,3], val = 3
//Output: 2
// after remove the val -3 the array will remains -> nums = [2,2,_,_]

/*solution -> first create the temp array then check for the given value.
    if the arrray's value not equals to the given value then assign the array's value in the temp.
    after complete the iteration assign the temp array in the original array.
*/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                temp[index] = nums[i];
                index++;
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=temp[i];
        }
        return index;
    }
}
