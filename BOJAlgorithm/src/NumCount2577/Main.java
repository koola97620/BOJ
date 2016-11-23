package NumCount2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine().trim());
		int num2 = Integer.parseInt(br.readLine().trim());
		int num3 = Integer.parseInt(br.readLine().trim());
		
		long result = num1 * num2 * num3;
		
		String str = Long.toString(result);
		char ch[] = str.toCharArray();
		
		
		int count[] = new int[10];
		
		for(int i=0 ; i < ch.length ; i++) {
			if(ch[i]=='0'){
				count[0]++;
			} else if(ch[i] == '1') {
				count[1]++;
			} else if(ch[i] == '2') {
				count[2]++;
			} else if(ch[i] == '3') {
				count[3]++;
			} else if(ch[i] == '4') {
				count[4]++;
			} else if(ch[i] == '5') {
				count[5]++;
			} else if(ch[i] == '6') {
				count[6]++;
			} else if(ch[i] == '7') {
				count[7]++;
			} else if(ch[i] == '8') {
				count[8]++;
			} else if(ch[i] == '9') {
				count[9]++;
			}
			
		}
		
		for(int i=0 ; i < count.length ; i++) {
			System.out.println(count[i]);
		}
		

	}

}
