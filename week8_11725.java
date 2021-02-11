// no. 11725 트리의 부모 찾기 - submit_no.26290478

import java.util.*;

public class Main
{
    static int arr[];
    static boolean visited[];
    static List<Integer> graph[];
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    graph = new ArrayList[n+1];
	    for(int i = 0; i <= n; i++)
	        graph[i] = new ArrayList<>();
	        
	    int a, b;
	    for(int i = 0; i < n-1; i++){
	        a = sc.nextInt();
	        b = sc.nextInt();
	        graph[a].add(b);
	        graph[b].add(a);
	    }
	    
	    arr = new int[n+1];
	    visited = new boolean[n+1];
	    visited[1] = true;
	    tree(1);

        for(int i = 2; i <= n; i++)
		    System.out.println(arr[i]);
	}
    static void tree(int parent){
        for(int child : graph[parent]){
            if(visited[child] == true) continue;
            arr[child] = parent;
            visited[child] = true;
            tree(child);
        }
    }
}
