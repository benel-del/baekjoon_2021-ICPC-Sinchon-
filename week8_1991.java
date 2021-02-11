// no. 1991 트리 순회 - submit_no.26290708

import java.util.*;

public class Main
{
    static int tree[][];
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();sc.nextLine();
	    
	    tree = new int[n+1][2];
        String str;
	    for(int i = 0; i < n-1; i++){
	        str = sc.nextLine();
	        if(str.charAt(2) != '.')
                tree[str.charAt(0)-'A'][0] = str.charAt(2)-'A';
            if(str.charAt(4) != '.')
            tree[str.charAt(0)-'A'][1] = str.charAt(4)-'A';
	    }

	    VLR(0);
	    System.out.println();
	    LVR(0);
	    System.out.println();
	    LRV(0);

	}
    static void VLR(int parent){
        System.out.print((char)('A' + parent));
        if(tree[parent][0] != 0)
            VLR(tree[parent][0]);
        if(tree[parent][1] != 0)
            VLR(tree[parent][1]);
    }
    static void LVR(int parent){
        if(tree[parent][0] != 0)
            LVR(tree[parent][0]);
        System.out.print((char)('A' + parent));
        if(tree[parent][1] != 0)
            LVR(tree[parent][1]);
    }
    static void LRV(int parent){
        if(tree[parent][0] != 0)
            LRV(tree[parent][0]);
        if(tree[parent][1] != 0)
            LRV(tree[parent][1]);
        System.out.print((char)('A' + parent));
    }
}
