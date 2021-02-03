// no. 1253 좋다 - submit_no.25993494

import java.util.Scanner;

public class Main
{
    static long arr[];
    static long tmp;
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        arr = new long[n];
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextLong();

        sort(0, n-1);
        
        int count = 0;
        long sum;
        for(int i = n-1; i >= 0; i--){
            int a = 0, b = n-1;
            while(true){
                if(a == i)
                    a++;
                if(b == i)
                    b--;
                if(a == b)
                    break;
                sum = (long)arr[a] + arr[b];
                if(sum == arr[i]){
                    count++;
                    break;
                }
                else if(sum > arr[i])
                    b--;
                else
                    a++;
            }
        }
        System.out.println(count);
	}
	
	public static void sort(int p, int n){
        if(p < n){
    	    int i = p, j = n;
    	    long k = arr[(p+n)/2];
    	    do{
    	        while(arr[i] < k){
    	            i++;
    	        }
    	        while(arr[j] > k){
    	            j--;
    	        }
                if(i <= j){
                    tmp = arr[i];
            	    arr[i] = arr[j];
            	    arr[j] = tmp;
            	    i++; j--;
                }
    	    } while(i <= j);
            sort(p, j);
            sort(i, n);
        }
	}
}
