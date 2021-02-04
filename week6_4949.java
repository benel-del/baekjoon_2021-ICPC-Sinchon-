// no. 4949 균형잡힌 세상 - submit_no.26050595

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line;
		char arr[] = new char[100];
		char ch;
		int i, k;
		while(true){
		    line = scan.nextLine();
		    if(line.equals(".") == true)
		        break;
		    k = 0;
		    for(i = 0; i < line.length(); i++){
		        ch = line.charAt(i);
		        if(ch == '(' || ch == '[')
		            arr[++k] = ch;
		        else if(k < 0 || (k >= 0 && (ch == ')' && arr[k--] != '(') || (ch == ']' && arr[k--] != '['))){
		            break;
		        }

		    }
		    if(k == 0 && i == line.length())
		        System.out.println("yes");
		    else
		        System.out.println("no");
		}
	}
}
