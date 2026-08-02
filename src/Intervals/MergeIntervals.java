package Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(
                intervals,
                Comparator.comparingInt(a -> a[0])
        );
        return intervals;
    }
}
