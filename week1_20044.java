// no.20044 Project Teams - submit_no.25102254

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int arr[] = new int[2*n];
        
        for(int i = 0; i < 2*n; i++) {
        	arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0] + arr[2*n-1];
        for(int i = 1, j = 2*n - 2; i < j; i++, j--) {
        	if(min > arr[i] + arr[j])
        		min = arr[i] + arr[j];
        }
        
		System.out.println(min);
	}
}
