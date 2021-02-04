// no. 1935 후위 표기식2 - submit_no.26051294

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();scan.nextLine();
		int num[] = new int[n];
		
		String line = scan.nextLine();
		double operand[] = new double[line.length()];
		for(int i = 0; i < n; i++)
		    num[i] = scan.nextInt();
		    
		char ch;
		int k = 0;
        for(int i = 0; i < line.length(); i++){
            ch = line.charAt(i);
            if(!(ch == '+' || ch == '-' || ch == '*' || ch == '/'))
                operand[k++] = num[ch-'A'];
            else{
                double op1 = operand[--k];
                double op2 = operand[--k];
                if(ch == '+')
                    operand[k++] = op2 + op1;
                else if(ch == '-')
                    operand[k++] = op2 - op1;
                else if(ch == '*')
                    operand[k++] = op2 * op1;
                else
                    operand[k++] = op2 / op1;
            }
        }
        
        System.out.print(String.format("%.2f", operand[--k]));
	}
}
