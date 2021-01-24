// no. 20500 Ezreal 여눈부터 가네 ㅈㅈ - submit_no.25635837

import java.util.Scanner;
public class Main
{	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[][] = new int[n+1][3];
		
		arr[1][1] = arr[1][2] = 1;
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = (arr[i-1][(j+1)%3] + arr[i-1][(j+2)%3]) % 1000000007;
			}
		}

		System.out.println(arr[n-1][1] );
	}
}

/*
arr[i][0] = arr[i-1][1] + arr[i-1][2];
arr[i][1] = arr[i-1][0] + arr[i-1][2];
arr[i][2] = arr[i-1][0] + arr[i-1][1];
*/
