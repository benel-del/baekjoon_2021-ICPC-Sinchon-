// no. 11659 구간 합 구하기 4 - submit_no.25859016

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int sum[] = new int[n+1];
        int m = scan.nextInt();
        for(int i = 1; i <= n; i++){
            sum[i] = scan.nextInt() + sum[i-1];
        }
        int out;
        for(int i = 0; i < m; i++){
            n = scan.nextInt();
            out = sum[scan.nextInt()] - sum[n-1];
            System.out.println(out);
        }
	}
}
