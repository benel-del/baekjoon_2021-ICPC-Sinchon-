// no.2231 분해합 - submit_no.25312615

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i, tmp, sum;
	    for(i = 1; i < n; i++) {
	    	sum = tmp = i;
	    	while(tmp > 0) {
	    		sum += tmp % 10;
	    		tmp /= 10;
	    	}
	    	if(sum == n) {
	    		System.out.println(i);
	    		break;
	    	}
	    }
	    if(i == n)
	    	System.out.println(0);
	}
}
