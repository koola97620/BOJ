package Array1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 뒤에 공백은 알아서 지워준다. 
		// 앞에 공백도 지워준다.
		// 문장이 입력안됐을때는??
		
		String input = br.readLine().trim();
		if(input.length() == 0) {
//			System.out.println("아무것도 입력안함!");
			System.out.println(0);
			return;
		}
		
		
		if(input.length() > 1000000) {
			return;
		}
		
		char words[] = input.toCharArray();
		
		
		
		
		int wordCount=0;
		
		
		
		boolean erased[] = new boolean[words.length];
		// 공백을 지운다기 보다는. 공백이 아닌것만 출력하기??
		
		for(int i=0 ; i < words.length ; i++) {
			if(words[i] == ' ') {
				eraseBlank(words, i,erased);
			}
			
		}
		
		// 문장에 공백이 3개면 단어는 4개다. 공백을 기준으로 나누니까.
		int resultCount =0;
		for(int i=0 ; i < words.length ; i++) {
			if(erased[i] == false) {
//				System.out.print(words[i]);
				if(words[i] == ' ') {
					resultCount++;
				}
				
			}
		}
		
		System.out.println(resultCount+1);
		

	}
	
	public static void eraseBlank(char arr[], int index , boolean erased[]) {
		int index2=index;
		int blankCount=0;
//		System.out.println(arr.length);
		while(arr[index2] == ' ') {
			index2++;
			blankCount++;
			if(index2 == arr.length - 1) {
				break;
			}
		}
		
		
//		System.out.println(index + " 부터 " + blankCount + " 개 공백 ");
		if(blankCount >= 2) {
			for(int i = index+1 ; i < index + blankCount ; i++) {
				erased[i] = true;
			}
		}
		
	}
	

}
