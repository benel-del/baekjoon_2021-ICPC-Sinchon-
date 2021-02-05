// no. 1158 요세푸스 문제 - submit_no.26062737

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int arr[] = new int[n];
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= n; i++)
		    queue.offer(i);

		int i = 1, j = 0;
		while(queue.isEmpty() != true){
		    if(i == k){
		        arr[j++] = queue.remove();
		        i = 1;
		    }
		    else{
		        i++;
		        queue.offer(queue.remove());
		    }
		}
		
		System.out.print("<");
		for(i = 0; i < n-1; i++)
		    System.out.print(arr[i] + ", ");
		System.out.print(arr[n-1] + ">");
	}
}
