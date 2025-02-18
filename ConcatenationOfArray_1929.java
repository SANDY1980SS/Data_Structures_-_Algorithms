package LeetCode;

public class ConcatenationOfArray_1929 {
    public static void main(String[] args) {
        int[] arr = {121};
        ConcatenationOfArray_1929 ob = new ConcatenationOfArray_1929();
       int[] sol = ob.getConcatenation(arr);
       for(int i: sol){
           System.out.print(i);
       }
    }
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
