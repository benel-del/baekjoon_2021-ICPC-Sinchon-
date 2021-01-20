// no.1757 달려달려 - submit_no.25489933

import java.util.Scanner;
public class Main
{	
	static int m;
	static int arr[][][];
	static int d[];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		m = scan.nextInt();
		d = new int[n+1];
		arr = new int[n+1][m+1][2];
		
		for(int i = 1; i <= n; i++)
			d[i] = scan.nextInt();
		
		System.out.println(func(n, 0, 0));
	}
	static int func(int time, int mm, int isrun) {
		if(mm > m || time < 1 || time == 1 && mm > 1)
			return 0;
		if(arr[time][mm][isrun] != 0)
			return arr[time][mm][isrun];
		
		if(isrun == 0) {
			arr[time][mm][isrun] = Math.max(Math.max(func(time-1, mm+1, 0), func(time-1, mm+1, 1)), func(time-1, mm, 0));
		}
		else {
			if(mm > 0)
				arr[time][mm][isrun] = d[time] + Math.max(func(time-1, 0, 0), func(time-1, mm-1, 1));
		}
		return arr[time][mm][isrun];
	}
}
