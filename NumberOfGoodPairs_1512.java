package leetCode;

public class NumberOfGoodPairs_1512 {
    public int numIdenticalPairs(int[] nums) {
        int pair=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i<j && nums[i]==nums[j]){
                    pair+=1;
                }
            }
        }
        return pair;
    }

    public static void main(String[] args) {

    }
}
