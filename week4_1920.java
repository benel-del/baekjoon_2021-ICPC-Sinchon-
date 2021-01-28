// no.1920 수 찾기 - submit_no.25796232

import java.util.Scanner;
import java.util.Random;
public class Main
{
    static Random random = new Random();
    static int arr[];
    static int tmp, rand;
	public static void main(String[] args) throws Exception {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    arr = new int[n];
	    for(int i = 0; i < n; i++)
	        arr[i] = scan.nextInt();
	    sort(0, n-1);
	    
	    int m = scan.nextInt();
        for(int j = 0, i, k; j < m; j++){
            i = 0;
            k = scan.nextInt();
            while(i < n && arr[i] < k)
                i++;
            if(i < n && arr[i] == k){
                System.out.print("1\n");
            }
            else{
                System.out.print("0\n");
            }
        }
	}
	
	public static void sort(int p, int n){
        if(p < n){
    	    int i = p, j = n;
    	    int k = arr[(p+n)/2];
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
