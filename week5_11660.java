// no. 11660 구간 합 구하기 5 - submit_no.25859507

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int sum[][] = new int[n+1][n+1];
        int m = scan.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                sum[i][j] = scan.nextInt() + sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1];
            }
	    }
        int input1, input2, input3, input4;
        for(int i = 0; i < m; i++){
            input1 = scan.nextInt();
            input2 = scan.nextInt();
            input3 = scan.nextInt();
            input4 = scan.nextInt();
            System.out.println(sum[input3][input4] - sum[input1-1][input4] - sum[input3][input2-1] + sum[input1-1][input2-1]);
        }
	}
}
