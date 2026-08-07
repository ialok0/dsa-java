import Arrays.*;
import HashMap.ContainsDuplicateII;
import HashMap.GroupAnagram;
import HashMap.HappyNumber;
import HashMap.LongestConsecutiveSequence;
import Intervals.InsertIntervals;
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
        int[][] arr = {{2,6},{1,3},{8,9}};
        int[] newint = {4,5};
        InsertIntervals insertIntervals = new InsertIntervals();
        System.out.println(Arrays.deepToString(insertIntervals.insert(arr,newint)));
    }
}