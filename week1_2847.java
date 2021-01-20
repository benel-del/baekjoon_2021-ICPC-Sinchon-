// no.2847 게임을 만든 동준이 - submit_no.25098728

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int count = 0;
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) {
        	arr[i] = scan.nextInt();
        }
        for(int i = n-1; i > 0; i--) {
        	while(arr[i-1] >= arr[i]) {
        		arr[i-1]--;
        		count++;
        	}
        }
        
		System.out.println(count);
	}
}
