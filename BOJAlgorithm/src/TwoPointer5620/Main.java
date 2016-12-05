package TwoPointer5620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 가장 가가운 두 점의 거리.  < 5620번 >
 * 평면상에 n개의 점이 놓여져 있다고 할때, 거리가 최소인 두개의 점을 구하고 그 거리를 알고 싶다.
 * 가장 가까운 두 점 사이의 거리의 제곱을 출력하시오.
 * */


class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 커스톰클래스를 이용해 중복을 제거할때 필요한 코드들 입니다.
	@Override
	public int hashCode() {
		return this.x + this.y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj;
			if(this.x==p.x && this.y == p.y) {
				return true;
			}
		}
		return false;
	}
		
	
	
	
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		long startTime = System.nanoTime();
		
		int countPoint = Integer.parseInt(br.readLine().trim());
		if(countPoint > 100000000 || countPoint < 2) {
			return;
		}
		
		List<Point> points = new ArrayList<Point>();
		
		
		while(points.size() != countPoint) {
			String input = br.readLine().trim();
			String inputs[] = input.split(" ");
			
			// inputs[0] = x 좌표. inputs[1] = y 좌표.
			
			if(Integer.parseInt(inputs[0]) > 10000 || Integer.parseInt(inputs[0]) < -10000 ||  Integer.parseInt(inputs[1]) > 10000 || Integer.parseInt(inputs[1]) < -10000) {
				return;
			}
			
			
			Point temp = new Point(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
			if(points.contains(temp)) {
				System.out.println("좌표중복");
				continue;
			} else {
				points.add(temp);
			}
			
		}
		
//		for(Point p : points) {
//			System.out.println("x : " + p.getX() + " y : " + p.getY());
//		}
		
		int min=Integer.MAX_VALUE;
		for(int i=0 ; i < points.size()-1 ; i++) {
			for(int j=i+1 ; j < points.size() ; j++) {
				int dist = distance(points.get(i), points.get(j));
				if(dist < min) {
					min = dist;
				}
			}
			
		}
		System.out.println(min);
//		long endTime = System.nanoTime();
//		System.out.println("시간 :" + (endTime - startTime));//9379724493
		//5269129556

	}
	
	public static int distance(Point p1, Point p2) {
		int disX = Math.abs(p2.getX() - p1.getX());
		int disY = Math.abs(p2.getY() - p1.getY());
		
		return ((disX*disX) + (disY*disY));
	}

}
