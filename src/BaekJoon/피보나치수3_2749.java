package BaekJoon;

import java.util.*;

public class 피보나치수3_2749 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fibo(N));
	}
	
	public static long fibo(int n) {
		if(n<=1)
			return n;
		else
			return fibo(n-1)+fibo(n-2);
	}
}
