// no.1966 프린터 큐 - submit_no.26069389

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int n, m, i, j, count;
		for(int k = 0; k < t; k++){
		    n = scan.nextInt();
		    m = scan.nextInt();
		    int arr[] = new int[n];
		    count = 1;
		    ArrayList<Integer> queue = new ArrayList<>();
		    for(j = 0; j < n; j++){
		        arr[j] = scan.nextInt();
		        queue.add(arr[j]);
		    }
		    Arrays.sort(arr);
		    i = 0; j = queue.size()-1;
		    while(queue.size() != 0){
		        if(i == queue.size())
                    i = 0;
		        if(arr[j] == queue.get(i)){
		            queue.remove(i);
		            j--;
		            if(i != m){
		                count++;
		                if(i < m)   m--;
		            }
		            else    break;
		        }
		        else    i++;
		    }
		    System.out.println(count);
		}
	}
}
