import Arrays.*;
import HashMap.ContainsDuplicateII;
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
        int[] arr = {1,2,3,1,4};

        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        System.out.println(containsDuplicateII.containsNearbyDuplicate(arr,2));
    }
}