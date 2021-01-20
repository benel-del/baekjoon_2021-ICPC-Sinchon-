// no. 14659 한조서열정리하고옴ㅋㅋ - submit_no.25096557

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
    int arr[] = new int[n];
    int arr2[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = scan.nextInt();
    }
    for(int i = 0; i < n-1; i++){
      for(int j = i+1; j < n; j++){
        if(arr[i] > arr[j]){
          arr2[i]++;
        }
        else
          break;
      }
		}
    Arrays.sort(arr2);
		System.out.println(arr2[n-1]);
	}
}
