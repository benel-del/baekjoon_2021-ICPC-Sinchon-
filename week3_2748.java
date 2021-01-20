// no.2748 피보나치 수 2 - submit_no.25484512

import java.util.Scanner;
public class Main
{	
	static long arr[];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		arr = new long[91];

		System.out.println(func(n));
	}
	static long func(int n) {
		if(n < 2)
			return arr[n] = n;
		if(arr[n] != 0)
			return arr[n];
		
		return arr[n] = func(n-2) + func(n-1);
	}
}
