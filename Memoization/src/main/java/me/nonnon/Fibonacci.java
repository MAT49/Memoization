package me.nonnon;

public class Fibonacci {
	
	public static int fib(int n, int[] memoiz) {
		if (n<=0) {
			return 0;
		} else if (n==1) {
			return 1;
		} else if (memoiz[n] == -1) {
			memoiz[n] = fib(n-1, memoiz) + fib(n-2, memoiz);
		}
		return memoiz[n];
	}

}
