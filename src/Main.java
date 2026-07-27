import Arrays.*;
import HashMap.ContainsDuplicateII;
import HashMap.GroupAnagram;
import HashMap.HappyNumber;
import HashMap.LongestConsecutiveSequence;
import Matrix.RotateMatrix;
import Matrix.SetMatrixZeroes;
import Matrix.SpiralMatrix;
import Strings.*;
import TwoPointer.ContainerWithMostWater;
import TwoPointer.IsSubsequence;
import TwoPointer.ThreeSum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,80};

        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        System.out.println(longestConsecutiveSequence.longestConsecutive(arr));
    }
}