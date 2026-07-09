package TwoPointer;
/*
    given an array and target. sum of two values of array equals to the target.
    return the array of two values index with +1;
    
    example - [1,2,3,6] target = 8;
    output -  [2,4]
 */

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0;
        int j=n-1;

        while(i<j){
            if(numbers[i]+numbers[j]<target){
                i++;
            }else if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                return new int[]{i+1,j+1};
            }
        }
        return null;
    }
}
