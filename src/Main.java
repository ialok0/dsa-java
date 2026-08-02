import Arrays.*;
import HashMap.ContainsDuplicateII;
import HashMap.GroupAnagram;
import HashMap.HappyNumber;
import HashMap.LongestConsecutiveSequence;
import Intervals.MergeIntervals;
import Intervals.SummaryRanges;
import Matrix.RotateMatrix;
import Matrix.SetMatrixZeroes;
import Matrix.SpiralMatrix;
import Strings.*;
import TwoPointer.ContainerWithMostWater;
import TwoPointer.IsSubsequence;
import TwoPointer.ThreeSum;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{2,6},{1,3},{5,7}};
        MergeIntervals mergeIntervals = new MergeIntervals();
        System.out.println(Arrays.deepToString(mergeIntervals.merge(arr)));
    }
}