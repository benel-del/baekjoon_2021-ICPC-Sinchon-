// no. 1697 숨바꼭질 - submit_no.26186053

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    class data{
            int a; int time;
            public data(int a, int time){ this.a = a; this.time = time; }
        }
		Scanner scan = new Scanner(System.in);
		List<data> order = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
        boolean visited[] = new boolean[100001];
	    int n = scan.nextInt();
		int b = scan.nextInt();
		
		visited[n] = true;
        order.add(new data(n, 0));
        while(order.size() != 0){
            data tmp = order.remove(0);
            int arr[] = {tmp.a+1, tmp.a-1, tmp.a*2};
            if(b == tmp.a)
    		    result.add(tmp.time);
		    for(int next : arr){
		        if(next < 0 || next > 100000)    continue;
		        if(visited[next])   continue;
		        visited[next] = true;
		        order.add(new data(next, tmp.time+1));
		    }
		}
        Collections.sort(result);
        System.out.println(result.get(0));
	}
}
