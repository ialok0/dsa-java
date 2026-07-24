import Arrays.*;
import HashMap.ContainsDuplicateII;
import HashMap.GroupAnagram;
import HashMap.HappyNumber;
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
        String[] str = {"tea","ate","tan","nat"};
        GroupAnagram groupAnagram = new GroupAnagram();
        System.out.println(groupAnagram.groupAnagrams(str));
    }
}