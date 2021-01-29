// no. 16401 과자 나눠주기 - submit_no.25798807

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int m = scan.nextInt();
	    
	    long high = 0, low = 1;;
	    long arr[] = new long[m];
	    for(int i = 0; i < m; i++){
	        arr[i] = scan.nextLong();
	        high = Math.max(arr[i], high);
	    }
        
        long ans = 0;
        while(low <= high){
            long mid = (low+high)/2;
            long sum = 0;
            for(int i = 0; i < m; i++){
                sum += arr[i]/mid;
            }
            if(sum >= n){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        System.out.print(ans);
	}
}
