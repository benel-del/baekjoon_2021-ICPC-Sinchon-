// no.1018 체스판 다시 칠하기 - submit_no.25313905

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.nextLine();
		String arr[] = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextLine();
		}
		
		scan.close();
		
		int ans = n*m;
		for(int i = 0; i <= n - 8; i++) {
			for(int j = 0; j <= m - 8; j++) {
				int count1 = 0, count2 = 0;
				for(int k = i; k < i + 8; k++) {
					for(int l = j; l < j + 8; l++) {
						if(arr[k].charAt(l) == 'W') {
							if((k + l) % 2 == 0)
								count1++;
							else
								count2++;
						}
						else {
							if((k + l) % 2 == 0)
								count2++;
							else
								count1++;
						}
					}
				}
				ans = Math.min(ans, Math.min(count1, count2));
			}
		}
    	System.out.println(ans);
	}
}
