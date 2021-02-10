// no. 5829 Luxury River Cruise - submit_no.26246461

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		int n = sc.nextInt();
		int m = sc.nextInt();
		double k = sc.nextDouble();
		
		int[][] port = new int[n+1][2];
		for(i = 1; i <= n; i++){
		    port[i][0] = sc.nextInt();
		    port[i][1] = sc.nextInt();
		} sc.nextLine();
		
		int[] direction = new int[m];
		String str = sc.nextLine();
    	for(i = 0; i < str.length(); i+=2){
    	    if(str.charAt(i) == 'L')
    		    direction[i/2] = 0;
		    else
		        direction[i/2] = 1;
    	}
    	
		int[] afterM = new int[n+1];
		for(j = 1; j <= n; j++){
		    afterM[j] = j;
		    for(i = 0; i < m; i++)
    	        afterM[j] = port[afterM[j]][direction[i]];
		}
		
		int fir = 1;
		while(k-- > 0)
		    fir = afterM[fir];
		System.out.println(fir);
	}
}
