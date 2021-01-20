// no.9663 N-Queen - submit_no.25316478

import java.util.Scanner;
public class Main
{	
	static int n;
	static int count = 0;
	static boolean used_row[];
	static boolean used_col[];
	static boolean used_upcro[];
	static boolean used_downcro[];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		used_row = new boolean[n];
		used_col = new boolean[n];
		used_upcro = new boolean[n*2-1];
		used_downcro = new boolean[n*2-1];
		
		func(0);
		System.out.println(count);
	}
	static void func(int k) {
		if(k == n) {
			count++;
			return;
		}
		for(int i = 0; i < n; i++) {
			if(used_row[i] == true || used_col[i] == true || used_upcro[i+k] == true || used_downcro[k-i+n-1] == true)
				continue;
			used_row[i] = true;
			used_col[i] = true;
			used_upcro[i+k] = true;
			used_downcro[k-i+n-1] = true;
			func(k+1);
			used_row[i] = false;
			used_col[i] = false;
			used_upcro[i+k] = false;
			used_downcro[k-i+n-1] = false;
		}
	}
}
