package Dynamic1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine().trim());
		int nums[][] = new int[input][input];
		
		
		for(int i=0 ; i < input ; i++) {
			String line = br.readLine().trim();
			String str[] = line.split(" ");
			
			for(int j=0 ; j <= i ; j++) {
				nums[i][j] = Integer.parseInt(str[j]);
				
			}
		}
		
		int prevMax=0;
		int resultMax=0;
		for(int i=1 ; i < input ; i++) {
			
			for(int j=0 ; j <= i ; j++) {
				
				
				if(j==0) {
					prevMax = nums[i-1][j];
				}else {
					prevMax = nums[i-1][j-1] > nums[i-1][j] ? nums[i-1][j-1] : nums[i-1][j];
				}
				
				
				
				nums[i][j] =  nums[i][j] + prevMax;
//				System.out.print(nums[i][j] + " ");
				prevMax=0;
				
				if(nums[i][j] > resultMax) {
					resultMax = nums[i][j];
				}
				
			
			}
//			System.out.println();
			
			
		}
		
		System.out.println(resultMax);
		
		

	}

}
