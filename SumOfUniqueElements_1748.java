package leetCode;

public class SumOfUniqueElements_1748 {
    class Solution {
        public int sumOfUnique(int[] nums) {
            int sum = 0;
            boolean isUnique;

            for (int i = 0; i < nums.length; i++) {
                isUnique = true;


                for (int j = 0; j < nums.length; j++) {
                    if (i != j && nums[i] == nums[j]) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    sum += nums[i];
                }
            }

            return sum;
        }
    }

    public static void main(String[] args) {

    }
}
