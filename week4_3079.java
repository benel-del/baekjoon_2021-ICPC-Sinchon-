// no. 3079 입국심사 - submit_no.25797817

import java.util.Scanner;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int m = scan.nextInt();
	    
	    int arr[] = new int[n];
	    for(int i = 0; i < n; i++)
	        arr[i] = scan.nextInt();

        long high, mid, low, ans;
        high = 1000000000000000000L;    // 중요
        low = 1;
        ans = 0;
        long sum;
        while(high >= low){
            mid = (high+low)/2;     // time
            sum = 0;  // people
            for(int i = 0; i < n; i++){
                sum = sum + mid/arr[i];
                if(sum >= m)    // for overflow
                    break;
            }
            if(sum >= m){
                ans = mid;
                high = mid-1;     // for the minist
            }
            else
                low = mid+1;
        }

        System.out.print(ans);
	}
}
