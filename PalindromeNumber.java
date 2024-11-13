package leetCode;

public class PalindromeNumber {

        public boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }
            int original_num = x;
            int temp = x;
            int rev = 0;
            int rem;
            while(temp != 0){
                rem = temp%10;
                rev = rev*10+rem;
                temp/=10;
            }
            if(rev == original_num){
                return true;
            }
            return false;
        }

    public static void main(String[] args) {

    }
}

