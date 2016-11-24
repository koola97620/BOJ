package OX8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCaseNum = Integer.parseInt(br.readLine().trim());
		String input[] = new String[testCaseNum];
		int result[] = new int[testCaseNum];
		
		for(int i=0 ; i < testCaseNum ; i++) {
			input[i] = br.readLine().trim();
			int countO=0;
			int tempResult=0;
			
			char ch[] = input[i].toCharArray();
			
			for(int j=0 ; j < ch.length ; j++) {
				if(ch[j] == 'O') {
					countO++;
				} else {
					countO=0;
				}
				tempResult += countO;
			}
			result[i] = tempResult;
		}
		
		for(int i=0; i < result.length ; i++) {
			System.out.println(result[i]);
		}
		
		
	}

}
