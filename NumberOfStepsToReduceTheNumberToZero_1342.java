package leetCode;

public class NumberOfStepsToReduceTheNumberToZero_1342 {
    public static void main(String[] args) {
        int num = 125460;
        System.out.println(ans(num,0));
    }
    static int ans(int num,int step){
        if(num==0){
            return step;
        }
        if(num%2==0){
            return ans(num/2,step+1);
        }
        else{
            return ans(num-1,step+1);
        }
    }
}
