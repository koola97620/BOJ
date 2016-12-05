package Sort2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		// 삽입정렬, 거품정렬 구현해보기 . 오름차순. 
		// 삽입정렬 : 자료배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여
		// 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘.
		// 3 7 2 5 1 4 (7부터 시작함.)   3 7 2 5 1 4            2 3 7 5 1 4
		// 2 3 5 7 1 4		// 1 2 3 4 7 5		// 1 2 3 4 5 7
		
		// 버블정렬 : 두 인접한 원소를 검사하여 정렬하는 방법.
		// 상당히 느리다.
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine().trim());
		int numbers[] = new int[count];
		int copy[] = numbers;
		
		for(int i=0 ; i < count ; i++) {
			numbers[i] = Integer.parseInt(br.readLine().trim());
		}
	
		insertionSort(numbers);
		//bubbleSort(numbers);

		

	}
	public static void insertionSort(int numbers[]) {
		for(int i=1 ; i < numbers.length ; i++) {
			int temp = numbers[i];
			int index = i-1;
			
			while(index >= 0 && numbers[index] > temp) {
				numbers[index+1] = numbers[index];
				index--;
			}
			numbers[index+1] =temp;
			
		}
		for(int k : numbers) {
			System.out.println(k);
		}
		
	}
	
	public static void bubbleSort(int numbers[]) {
		for(int i=0 ; i < numbers.length ; i++) {
			for(int j=0 ; j < numbers.length - 1 ; j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j+1];
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
				}
			}
			
			System.out.print(i+1 + " Pass : ");
			for(int k=0 ; k < numbers.length ; k++) {
				System.out.print(numbers[k] +" ");
			}
			
		}
	}

}
