package Hanoi11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static List<String> path = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		/*
		 * 세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로 쌓여있다. 
		 * 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로  옮기려 한다.
		 * 한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
		 * 쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.(중간 과정 역시 그래야함)
		 * 이 작업을 수행하는데 필요한 이동순서를 출력하는 프로그램을 작성하라
		 *
		 */
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine().trim());
		
		hanoiTower("1","2","3",input);
		System.out.println(path.size());
		for(String str : path) {
			System.out.println(str);
		}
		
		
		

	}
	
	public static void hanoiTower(String first, String second, String third, int n) {
		// first : 왼쪽탑. second : 가운데탑 , third : 오른쪽탑.
		// 첫번째 매개변수 : 원판이 쌓여있는 탑.
		// 두번째 매개변수 : 보조탑.
		// 세번째 매개변수 : 목적지 탑.
		if(n==1) {
			//path.add(n + " : " + first + " > " + third);
			path.add(first + " " + third);
		}else {
			
			
			hanoiTower(first,third,second,n-1);
			// 마지막탑을 보조탑으로 이용하여 첫번째 탑에 있는 n-1개의 원반들을 중간에 있는 탑으로 이동한다.
			
			// input이 3일때.
			// 가장 큰 원판(3)을 목적지 탑으로 이동할때 사용.
			path.add(first + " " + third);
			
			
			hanoiTower(second,first,third,n-1);
			// 첫번째 탑을 보조탑으로 이용하여 중간탑에 있는 n-1개의 원반들을 목적지로 이동한다. 
		}
		
		
	}

}
