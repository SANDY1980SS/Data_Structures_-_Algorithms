package leetCode;

public class FibonacciNumber_509 {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {

    }
}
