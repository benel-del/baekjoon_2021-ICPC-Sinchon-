// no. 9012 괄호 - submit_no.26061953

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt(); scan.nextLine();
		Character ch;
		int i;
		for(int j = 0; j < t; j++){
		    Stack<Character> stack = new Stack<>();
		    String line = scan.nextLine();
		    for(i = 0; i < line.length(); i++){
		        ch = line.charAt(i);
		        if(ch == '(')
		            stack.push(ch);
		        else if(ch == ')'){
		            if(stack.isEmpty() == true) break;
    		        else    stack.pop();
		        }
		    }
		    if(stack.isEmpty() == true && i == line.length())
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
