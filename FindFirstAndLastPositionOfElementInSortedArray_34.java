package leetCode;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int first = firstsearch(nums,target);
        int second = lastsearch(nums,target);
        result[0] = first;
        result[1] = second;
        return result;
    }
    public int firstsearch(int[] nums,int target){
        int start=0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                ans = mid;
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    public int lastsearch(int[] nums,int target){
        int start=0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target==nums[mid]){
                ans = mid;
                start = mid+1 ;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}
