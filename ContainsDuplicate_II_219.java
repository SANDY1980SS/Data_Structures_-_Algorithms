package leetCode;

public class ContainsDuplicate_II_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int a = Math.abs(i-j);
                if(a>k){
                    break;
                }
                if((a<=k) && (nums[i] == nums[j]) ){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
