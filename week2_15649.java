// no.15649 N과 M (1) - submit_no.25315202

import java.util.Scanner;
public class Main
{
	static int n, m;
	static int ans[];
	static boolean used[];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		ans = new int[m];
		used = new boolean[n];

		func(0);
	}
	
	private static void func(int k) {
		if(k == m) {
			for(int i = 0; i < m; i++)
				System.out.print(ans[i] + " ");
			System.out.println();
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(used[i] == true)
				continue;
			used[i] = true;
			ans[k] = i+1;
			func(k+1);
			used[i] = false;
		}
	}
}
