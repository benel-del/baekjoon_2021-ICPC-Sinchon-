// no. 1463 1로 만들기 - submit_no.25487073

import java.util.Scanner;
public class Main
{	
	static int arr[] = new int[1000001];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		arr[1] = 0; arr[2] = 1;
		for(int i = 3; i <= n; i++) {
			int min = 1000000;
			if(i % 2 == 0)
				min = Math.min(min, arr[i/2]+1);
			if(i % 3 == 0)
				min = Math.min(min, arr[i/3]+1);
			arr[i] = Math.min(min, arr[i-1]+1);
		}
		
		System.out.println(arr[n]);
	}
}
