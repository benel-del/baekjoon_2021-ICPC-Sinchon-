// no.1931 회의실 배정 - submit_no.25240062

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		class Pair implements Comparable<Pair>{
			Integer x;
			Integer y;
			public Pair(Integer x, Integer y) {
				this.x = x;
				this.y = y;
			}
			public Integer first() {
				return x;
			}
			public Integer second() {
				return y;
			}
			@Override
		    public int compareTo(Pair pair) {
				if(this.y != pair.y)
					return this.y - pair.y;
				else {
					return this.x - pair.x;
				}
		    }
		}

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Pair[] arr = new Pair[n];
		int k;
        for(k = 0; k < n; k++) {
        	arr[k] = new Pair(scan.nextInt(), scan.nextInt());
        }
        

        Arrays.sort(arr);

        int end = arr[0].second(), count = 1;
        for(int i = 1; i < k; i++) {
        	if(arr[i].first() < end)
        		continue;
        	end = arr[i].second();
        	count++;
        }
  
		System.out.println(count);
	}
}
