package Dynamic1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// 매 행마다 최소값을 골라 기존 최소값에 더하는 방식으로는 구할 수 없다.

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
		
		// 여기까지가 입력세팅.

		int r; 
		int g;
		int b;
		int result[][] = new int[3][input];
		result[0][0] = nums[0][0];
		result[1][0] = nums[0][1];
		result[2][0] = nums[0][2];
		
		for(int i=1 ; i < input ; i++) {
			r = nums[i][0];
			g = nums[i][1];
			b = nums[i][2];
			
			// R = 0  G = 1  B = 2
			result[0][i] = r + Math.min(result[1][i-1], result[2][i-1]);
			result[1][i] = g + Math.min(result[0][i-1], result[2][i-1]);
			result[2][i] = b + Math.min(result[0][i-1], result[1][i-1]);
			
		}
	
		int min = Math.min(Math.min(result[0][input-1], result[1][input-1]), result[2][input-1]);
		System.out.println(min);
		
		
		

	}
	
	
	

}
