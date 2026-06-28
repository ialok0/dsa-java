package Arrays;
/*
* You are initially positioned at the array's first index,and each element in the array represents your maximum jump
*  length at that position.
* check if the given number in array can appraoch the last index by jump their maximum length then return true otherwise false;
* like input = [2,3,1,1,0,4]
* output  = false
*
* input 2 = [2,4,1,1,0,6]
* output 2 = true
* */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(i>maxIndex){
                return false;
            }
            maxIndex = Math.max(maxIndex , i + nums[i]);
            System.out.println(i +" = "+ maxIndex);
        }
        return true;
    }
}
