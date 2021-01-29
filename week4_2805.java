// no.2805 나무 자르기 - submit_no.25801177

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int m = scan.nextInt();
	    
	    long high = 0, low = 0;;
	    long arr[] = new long[n];
	    for(int i = 0; i < n; i++){
	        arr[i] = scan.nextLong();
	        high = Math.max(arr[i], high);
	    }
        
        long ans = 0;
        while(low <= high){
            long mid = (low+high)/2;
            long sum = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] > mid)
                    sum += arr[i] - mid;
                
            }
            if(sum >= m){
                ans = Math.max(ans, mid);
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        System.out.print(ans);
	}
}
