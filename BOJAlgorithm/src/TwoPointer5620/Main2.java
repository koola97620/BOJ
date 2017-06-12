package TwoPointer5620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* 가장 가가운 두 점의 거리.  < 5620번 >
 * 평면상에 n개의 점이 놓여져 있다고 할때, 거리가 최소인 두개의 점을 구하고 그 거리를 알고 싶다.
 * 가장 가까운 두 점 사이의 거리의 제곱을 출력하시오.
 * */

/* Arrays 클래스의 sort()함수를 사용하면 오름차순 정렬할 수 있다.
 * 배열의 원소가 객체라면 comparable 인터페이스를 구현해야한다. 
 * */

// 중복검사를 하지 말고 코드를 먼저 짜볼까...? 
// 아니면 Set으로 시작해보자.

class Point2 implements Comparable<Point2>{
	private int x;
	private int y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	// 커스톰클래스를 이용해 중복을 제거할때 필요한 코드들 입니다.
//	@Override
//	public int hashCode() {
//		return this.x + this.y;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Point2) {
//			Point2 p = (Point2)obj;
//			if(this.x==p.x && this.y == p.y) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	// HashSet은 hashCode와 equals를 오버라이딩 해줘야 하는데
	// TreeSet은 compareTo만 오버라이딩해도 된다. (정렬된 상태로 저장이 된다.)
	// 아래 compareTo 오름차순정렬!
	
	@Override
	public int compareTo(Point2 p) {
////		int compareX = p.getX();
		if(this.y < p.getY()) {
			return -1;
		}else if( this.y == p.getY()) {
			return 0;
		} else {
			return 1;
		}
		
		
	}
	
}



public class Main2 {
	
	
	
	
	public static void main(String[] args) throws IOException {
		// 점의 개수.
//		int count = 11;
//		int point[][] = {{0,0} , {1,4} , {3,2} , {5,5} , {1,7} , {-3,-5} , {-9,-2} , {10,1} , {12,2} , {15, 7}, {12,8}};
//		
//		for(int i=0 ; i < count ; i++) {
//			System.out.println(point[i][0] + " " + point[i][1]);
//		}
/*

0 0
1 4
3 2
5 5
1 7
-3 -5
-9 -2
10 1
12 2
15 7
12 8


 */
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int countPoint = Integer.parseInt(br.readLine().trim());
		if(countPoint > 100000000 || countPoint < 2) {
			return;
		}
		
		// 처음부터 셋으로 시작하면 중복검사도 필요 없고 정렬도 필요없다. 
		// 속도는 더 빠르려나...?
		// 원래 Set이... comparable 구현해서 넣어야만 하나...??
		
		
		List<Point2> inputList = new ArrayList<Point2>();
		
		
		while(inputList.size() != countPoint) {
			String input = br.readLine().trim();
			String inputs[] = input.split(" ");
			
//			inputs[0] = x 좌표. inputs[1] = y 좌표.
			
			if(Integer.parseInt(inputs[0]) > 10000 || Integer.parseInt(inputs[0]) < -10000 ||  Integer.parseInt(inputs[1]) > 10000 || Integer.parseInt(inputs[1]) < -10000) {
				return;
			}
			
			Point2 temp = new Point2(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
//			testSet2.add(temp);
			inputList.add(temp);
			
		}
		
		/* Collections.sort 안하고 바로 Set에다가 넣으면 알아서 자동정렬된다.
		 * 
		 * */
	
//		Collections.sort(points);
//		for(Point2 p : points) {
//			System.out.println("x : " + p.getX() + " y : " + p.getY());
//		}
		
		
		// x 크기 순서로 정렬하기.
		Collections.sort(inputList, new Comparator<Point2>() {
			@Override
			public int compare(Point2 p1, Point2 p2) {
				if(p1.getX() < p2.getX()) {
					return -1;
				} else if(p1.getX() == p2.getX()) {
					return 0;
				} else {
					return 1;
				}
			}
		});
		
		TreeSet<Point2> candidate = new TreeSet<Point2>();
//		List<Point2> candidate = new ArrayList<Point2>(new TreeSet<Point2>());
		candidate.add(inputList.get(0));
		candidate.add(inputList.get(1));
//		Collections.sort(candidate);
		
		int ans = distance(inputList.get(0), inputList.get(1));
		int start=0;
		
		for(int i=2 ; i < countPoint ; i++) {
			Point2 now = inputList.get(i);
			while(start < i) {
				Point2 p = inputList.get(start);
				int x = now.getX() - p.getX();
				if(x*x > ans) {
					candidate.remove(p);
					start += 1;
				} else {
					break;
				}
			} // while 끝.
			
			int d = (int)Math.sqrt((double)ans) +1;
			int minY = now.getY() - d;
			int maxY = now.getY() + d;
//			Point2 lower_point = new Point2(-100000, now.getY()-d);
//			Point2 upper_point = new Point2(100000, now.getY()+d);
//			
//			Collections.sort(candidate);
//			int lower = Collections.binarySearch(candidate, lower_point);
//			int upper = Collections.binarySearch(candidate, upper_point);
//			System.out.println("lower : " + lower + " upper : "+ upper);
//			Iterator<Point2> itr = candidate.iterator();
			
			// lower_point 로 최저점 잡고/
			// 이 최저점에 해당하는 index값을 검색해서 찾은다음 lower에 저장.
			// upper도 마찬가지 방식. lower ~ upper 사이의 점에서 최소거리 구하기.
			
			// Set candidate는 y 순으로 오름차순 정렬되어있다.
//			int lower=Integer.MAX_VALUE;
//			int lowerY=0;
//			int upper=Integer.MAX_VALUE;
//			int upperY=0;
//			int count=0;
//			while(itr.hasNext()) {
//				int a = Abs(itr.next().getY() - minY);
//				if(lower > a) {
//					lower =a;
//					lowerY = count;
//				}
//				count++;
//			}
//			count=0;
//			while(itr.hasNext()) {
//				int a = Abs(maxY - itr.next().getY());
//				if(upper > a) {
//					upper =a;
//					upperY = count;
//				}
//				count++;
//			}
//			
//			System.out.println("lowerY : " + lowerY + " upperY : " + upperY);
//			
			
//			for(int k = lowerY ; k <= upperY ; k++) {
//				int dis = distance(now, new Point2(1,2));
//				if( dis < ans) {
//					ans = dis;
//				}
//			}
			candidate.add(now);
//			Collections.sort(candidate);
			
		}
		
		System.out.println(ans);
		
		for(Point2 p : inputList) {
			System.out.println("List : x : " + p.getX() + " y : " + p.getY());
		}
		
		
		for(Point2 p : candidate) {
			System.out.println("Set : x : " + p.getX() + " y : " + p.getY());
		}
		
		
		
	}
	
	public static int distance(Point2 p1, Point2 p2) {
		return (p2.getX() - p1.getX())*(p2.getX() - p1.getX()) + (p2.getY() - p1.getY())*(p2.getY() - p1.getY());
	}
	
	public static int Abs(int num) {
		return (num <0)?-num:num;
	}

}
