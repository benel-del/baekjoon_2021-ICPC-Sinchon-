// no. 1260 DFS와 BFS - submit_no.26187516

import java.util.*;

public class Main
{
    static boolean visited[];
    static List<Integer>[] vList;
    static List<Integer> order = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
	    int n = scan.nextInt();
		int m = scan.nextInt();
		int v = scan.nextInt();
		vList = new ArrayList[n+1];
		for(int i = 1; i <= n; i++)
		    vList[i] = new ArrayList<>();
		int a, b;
		for(int i = 0; i < m; i++){
		    a = scan.nextInt();
		    b = scan.nextInt();
		    vList[a].add(b);
		    vList[b].add(a);
		}
	    for(int i = 1; i <= n; i++)
		    Collections.sort(vList[i]);
		
		visited = new boolean[1001];
		dfs(v);
		System.out.println();
		visited = new boolean[1001];
		bfs(v);
	}
	
	static public void dfs(int c){
	    visited[c] = true;
	    System.out.print(c + " ");
	    for(int nxt : vList[c]){
            if(visited[nxt])    continue;
            dfs(nxt);
        }
	}
	
	static public void bfs(int c){
	    visited[c] = true;
	    order.add(c);
	    while(order.size() != 0){
	        int tmp = order.remove(0);
	        System.out.print(tmp + " ");
	        for(int nxt : vList[tmp]){
	            if(visited[nxt])    continue;
	            visited[nxt] = true;
	            order.add(nxt);
	        }
	    }
	}
}
