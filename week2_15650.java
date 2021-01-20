// no.15650 N과 M (2) - submit_no.25315503

import java.util.Scanner;
public class Main
{
	static int n, m;
	static int ans[];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		ans = new int[m];

		func(0, 1);
	}
	
	private static void func(int k, int num) {
		if(k == m) {
			for(int i = 0; i < m; i++)
				System.out.print(ans[i] + " ");
			System.out.println();
			return;
		}
		
		for(int i = num; i <= n; i++) {
			ans[k] = i;
			func(k+1, i+1);
		}
	}
}
