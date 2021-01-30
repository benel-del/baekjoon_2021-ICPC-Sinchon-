// no. 1484 다이어트 - submit_no.25861381

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long g = scan.nextLong();
        long arr[] = new long[200001];
        for(int i = 1; i <= 200000; i++)
            arr[i] = (long)i*i;

        int count = 0;
        int a = 1, b = 1;
        long abs;
        while(true){
            if(b > 200000)
                break;
            abs = (long)(arr[b] - arr[a]);
            if(abs == g){
                System.out.println(b);
                count++;
                b++;
            }
            else if(abs > g)
                a++;
            else if(abs < g)
                b++;
        }
        if(count == 0)
            System.out.println("-1");
	}
}
