// no.16206 롤케이크 - submit_no.25237547

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		for(int i = 0, input; i < n; i++){
			input = scan.nextInt();
			if(input % 10 == 0)
				arr1.add(input);
			else
				arr2.add(input);
		}
		
		int cut = 0;
		int count = 0;
		Collections.sort(arr1);
		Collections.sort(arr2);
		for(int i = 0; i < arr1.size(); i++) {
			while(cut < m && arr1.get(i) > 10) {
				arr1.set(i, arr1.get(i)-10);
				cut++;
				count++;
			}
			if(arr1.get(i) == 10)
				count++;
		}
		for(int i = 0; i < arr2.size(); i++) {
			while(cut < m && arr2.get(i) > 10) {
				arr2.set(i, arr2.get(i)-10);
				cut++;
				count++;
			}
		}
		
		System.out.println(count);
	}

}
