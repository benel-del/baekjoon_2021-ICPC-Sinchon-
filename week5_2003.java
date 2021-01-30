// no. 2003 수들의 합 2 - submit_no.25859955

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int arr[] = new int[n+1];
        int m = scan.nextInt();
        for(int i = 1; i <= n; i++){
            arr[i] = scan.nextInt() + arr[i-1];

	    }
        int count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                if(arr[j] - arr[i-1] == m)
                    count++;
            }
        }
        System.out.println(count);
	}
}
