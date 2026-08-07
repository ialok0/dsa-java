package Intervals;

import java.util.ArrayList;
import java.util.List;

/*
    in this problem, given an array of numbers create an interval for the sorted ascending order .

    for example - [1,2,3,4,7,8,9,10]
    ans should - [1=>4,7=>10]

*/
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int n = nums.length;

        for(int i=0 ; i<n; i++){
            int start = nums[i];

            while(i+1<n && nums[i+1] == nums[i] + 1) {
                i++;
            }
            if(start != nums[i]){
                result.add(""+start + "->" + nums[i]);
            }else{
                result.add(""+start);
            }
        }
        return result;
    }
}
