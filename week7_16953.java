// no. 16953 A → B - submit_no.26145988

import java.util.*;

public class Main
{
    static double b;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextInt();
		b = scan.nextDouble();

		if((b = func(a, 0)) != -1)
		    b++;
		System.out.println((int)b);
	}
    private static int func(double a, int count){
        if(a > b)
            return -1;
        else if(a == b)
            return count;
        
        int x = func(a*2, count+1);
        int y = func(a*10+1, count+1);
        
        if(x == -1 && y == -1)  return -1;
        else if(x == -1)    return y;
        else if(y == -1)    return x;
        else    return Math.min(x, y);
    }
}
