// no. 1068 트리 - submit_no.26289930

import java.util.*;

public class Main
{
    static int n;
    static int count = 0;
    static int arr[][];
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    arr = new int[n][2];
	    for(int i = 0; i < n; i++){
	        arr[i][0] = sc.nextInt();
	        if(arr[i][0] > -1)
	            arr[arr[i][0]][1]++;
	    }
	    
		int k = sc.nextInt();
	    for(int i = 0; i < n; i++){
		    if(arr[i][1] == 0)
		        count++;
		}
		
		if(arr[k][0] > -1 && arr[arr[k][0]][1] == 1)
		    count++;
		if(arr[k][1] == 0)
		    count--;
		else leaf(k);
		System.out.println(count);
	}
	
	public static void leaf(int k){
	    for(int i = 0; i < n; i++){
	        if(arr[i][0] == k){
	            if(arr[i][1] == 0)
	                count--;
	            else
	                leaf(i);
	        }
	    }
	}
}
