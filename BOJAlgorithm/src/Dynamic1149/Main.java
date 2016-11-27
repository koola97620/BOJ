package Dynamic1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine().trim());
		if(input > 1000) {
			System.out.println("error");
		}
		String inputNums[] = new String[input];
		
		int nums[][] = new int[input][3];
		
		for(int i=0 ; i < input ; i++) {
			inputNums[i] = br.readLine().trim();
			String line[] = inputNums[i].split(" ");
			
			if(line.length > 3) {
//				System.out.println("R G B");
				return;
			}
			
			for(int k=0 ; k < 3 ; k++) {
				nums[i][k] = Integer.parseInt(line[k]);
			}
			
		}

		
		int min=Integer.MAX_VALUE;
		int result=0;
		int color=0;
		
		for(int i =0 ; i < 3 ; i++) {
			if(nums[0][i] < min) {
				min = nums[0][i];
				color = i;
			}
		}
		result += min;
		
		// i=0 첫번재 줄은 위에서 실행함.
		for(int i=1 ; i < input ; i++) {
			min=Integer.MAX_VALUE;//초기화.
			
			for(int k=0 ; k < 3 ; k++) {
				if(color ==k) {
					continue;
				}else {
					if(nums[i][k] < min) {
						min = nums[i][k];
						color=k;
					}
				}
				
				
			}
			
			
			result += min;
		}
		System.out.println(result);
		
		
		

	}

}
