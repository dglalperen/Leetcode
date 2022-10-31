package Q1_Q10;

import java.util.Arrays;

public class Q1_Two_Sum {
    public static void main(String[] args) {
        int [] nums = {2,5,5,11};
        int target = 10;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
