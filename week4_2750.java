  
// no.2750 수 정렬하기 - submit_no.25795280

import java.util.Scanner;
public class Main
{
    static int arr[];
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    arr = new int[n];
	    for(int i = 0; i < n; i++)
	        arr[i] = scan.nextInt();
	    sort(n-1);
	    for(int i = 0; i < n; i++)
	        System.out.println(arr[i]);
	}
	
	public static void sort(int n){
	    int max = arr[n];
	    int tmp;
	    int index = n;
	    for(int i = 0; i < n; i++){
	        if(arr[i] > max){
	            max = arr[i];
	            index = i;
	        }
	    }
	    tmp = arr[n];
	    arr[n] = arr[index];
	    arr[index] = tmp;
	    
	    if(n > 0)
	        sort(n-1);
	}
}
