// no. 11931 수 정렬하기 4 - submit_no.25796120

import java.io.*;
import java.util.Random;
public class Main
{
    static Random random = new Random();
    static int arr[];
    static int tmp, rand;
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int n = Integer.parseInt(br.readLine());
	    arr = new int[n];
	    for(int i = 0; i < n; i++)
	        arr[i] = Integer.parseInt(br.readLine());
	    br.close();

	    sort(0, n-1);
	    for(int i = 0; i < n; i++)
	        bw.write(arr[i]+"\n");
	    bw.flush();
	    bw.close();
	}
	
	public static void sort(int p, int n){
        if(p < n){
    	    int i = p, j = n;
    	    int k = arr[(p+n)/2];
    	    do{
    	        while(arr[i] > k){
    	            i++;
    	        }
    	        while(arr[j] < k){
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
