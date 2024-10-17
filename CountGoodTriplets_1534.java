package leetCode;

public class CountGoodTriplets_1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int pairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c)
                    {
                        pairs++;
                    }
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {

    }
}
