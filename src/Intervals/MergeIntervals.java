package Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
     in merge intervals, if the intervals are overlapping then merge the intervals based on the all numbers comes
     between the new interval.

     for example - [[2,6],[1,3],[8,9]]
     ans should - [[1,6],[8,9]]
*/

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> ans = new ArrayList<>();

        int n = intervals.length;
        int i = 0;

        while(i<n){
            int start = intervals[i][0];
            int end   = intervals[i][1];

            int j = i+1;

            while(j<n && intervals[j][0] <= end){
                end = Math.max(end,intervals[j][1]);
                j++;
            }

            ans.add(new int[]{start, end});

            i=j;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
