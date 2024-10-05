package leetCode;

public class FindMinimumOperationTOMakeAllElementsDivisibleByThree_3190 {
    public int minimumOperations(int[] nums) {
        int operation=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3 !=0 ){
                if((nums[i]-1)%3==0){
                    operation++;
                }
                if((nums[i]+1)%3==0){
                    operation++;
                }
            }
        }
        return operation;
    }

    public static void main(String[] args) {

    }
}
