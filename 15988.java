// no. 15988 1,2,3 더하기 3 - submit_no.25485385

import java.util.Scanner;
public class Main
{	
	static long arr[] = new long[1000001];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		arr[1] = 1; arr[2] = 2; arr[3] = 4;
		for(int i = 4; i <= 1000000; i++) {
			arr[i] += (arr[i-1] + arr[i-2] + arr[i-3]) % 1000000009;
		}
		
		int t = scan.nextInt();
		int n;
		for(int i = 0; i < t; i++) {
			n = scan.nextInt();
			System.out.println(arr[n]);
		}
	}
}
