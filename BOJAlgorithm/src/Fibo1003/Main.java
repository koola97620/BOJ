package Fibo1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count0;
	static int count1;
	
	public static int fibonacci(int n){
		if( n==0 ) {
			count0++;
			return 0;
		} else if(n==1) {
			count1++;
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		int nums[] = new int[testCase];
		
		for(int i=0; i < testCase ; i++) {
			nums[i] = Integer.parseInt(br.readLine().trim());
		}
		
		// nums 에 값을 입력 받았다.
		
		for(int i=0; i < nums.length ; i++) {
			count0 =0;
			count1 =0;
			fibonacci(nums[i]);
			System.out.println(count0 + " " + count1);
		}
		
		
		
		

	}

}
