// no. 1021 회전하는 큐 - submit_no.26070074

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		ArrayList<Integer> queue = new ArrayList<>();
		int arr[] = new int[m];
		for(int i = 0; i < n; i++)
		    queue.add(i+1);
		for(int i = 0; i < m; i++)
		    arr[i] = scan.nextInt();
		
		int count = 0;
		for(int i = 0; i < m; i++){
		    while(queue.get(0) != arr[i]){
		        int pos = queue.indexOf(arr[i]);
		        if(pos <= queue.size()/2)
		            queue.add(queue.remove(0));
		        else
		            queue.add(0, queue.remove(queue.size()-1));
		        count++;
		    }
		    queue.remove(0);
		}
		System.out.println(count);
	}
}
