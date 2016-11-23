package BFS1261;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

class Node implements Comparable<Node>{
	private int x;
	private int y;
	private int count;
	
	public int getCount() {
		return count;
	}


	public Node(int x, int y, int count) {
		this.x = x;
		this.y = y;
		this.count = count;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	@Override
	public int compareTo(Node node) {
		if(this.count > node.count) {
			return 1;
		} else if(this.count < node.count) {
			return -1;
		}
		return 0;
	}
}



public class Main_fail {
	static int node[][] = new int[100][100];
	static boolean visited[][] = new boolean[100][100];
	static int count[][] = new int [100][100];
	
	

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		String widthHeight[] = input1.split(" ");
		
		int width = Integer.parseInt(widthHeight[0]);
		int height = Integer.parseInt(widthHeight[1]);
		
		
		inputMethod(node,height, width, br);
		
		// 입력 끝
		
		
		
		// 시작위치기 때문에 트루.
		visited[0][0] = true;
		
		Node point = new Node(0,0,0);
		
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		
		
		queue.add(point);
		
		int count2 = 0;
		
		while(!queue.isEmpty()) {
			
			Node curPoint = queue.poll();
			
			// 아웃풋
			count2 = curPoint.getCount();
			
			
			
			// 끝에 도착!
//			if(curPoint.getX() == width-1 && curPoint.getY() == height -1) {
//				System.out.println(count);
//				return;
//			}
			
			
			
			int xArray[] = {0,1,-1};
			int yArray[] = {0,1,-1};
			
			
			if(curPoint.getX() +1 < width && curPoint.getY() < height) {
				if(visited[curPoint.getX()+1][curPoint.getY()] == false) {
					movingNode(curPoint,xArray[1],yArray[0],queue);
				}
				
			}
			
			
			if(curPoint.getX() < width && curPoint.getY() + 1 < height) {
				if(visited[curPoint.getX()][curPoint.getY()+1] == false) {
					movingNode(curPoint,xArray[0],yArray[1],queue);
				}
			}
			
			if(curPoint.getX() -1 > 0 && curPoint.getY() < height) {
				if(visited[curPoint.getX()-1][curPoint.getY()] == false) {
					movingNode(curPoint,xArray[2],yArray[0],queue);
				}
			}
			
			if(curPoint.getX() < width && curPoint.getY() -1 > 0) {
				if(visited[curPoint.getX()][curPoint.getY()-1] == false) {
					movingNode(curPoint,xArray[0],yArray[2],queue);
				}
			}
			
			
		}
		System.out.println(count);
		for(int i=0 ; i < height ; i++) {
			for (int j=0 ; j < width ; j++) {
				System.out.print(count[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("출력 : " + count[height-1][width-1]);
		

	}
	
	
	public static void inputMethod(int[][] node, int height, int width, BufferedReader br) throws IOException {
		
		
		for(int i=0 ; i < height ; i++) {
			String nodeContent = br.readLine();
			
			for(int j=0 ; j < width ; j++) {
				String temp = Character.toString(nodeContent.charAt(j));
				node[i][j] = Integer.parseInt(temp);
				
			}
		}	
	}
	
	
	public static void movingNode(Node curPoint, int x, int y,Queue<Node> queue) {
		visited[curPoint.getX()+x][curPoint.getY()+y] = true;
		if(node[curPoint.getX()+x][curPoint.getY()+y] == 1) {
			node[curPoint.getX()+x][curPoint.getY()+y] = 0;
//			count[curPoint.getX()+x][curPoint.getY()+y] = Math.min(count[curPoint.getX()][curPoint.getY()]+1, count[curPoint.getX()+x][curPoint.getY()+y]);
			count[curPoint.getY()+y][curPoint.getX()+x] = curPoint.getCount()+1;
			queue.offer(new Node(curPoint.getX() +x, curPoint.getY()+y , (curPoint.getCount()+1)));
			
			System.out.println((curPoint.getX()+x) + "   " + (curPoint.getY()+y) + "   " + curPoint.getCount());
		} else{
//			queue.offer(new Node(curPoint.getX() +x, curPoint.getY()+y , curPoint.getCount()));
//			count[curPoint.getX()+x][curPoint.getY()+y] = Math.min(count[curPoint.getX()][curPoint.getY()]+1, count[curPoint.getX()+x][curPoint.getY()+y]);
			count[curPoint.getY()+y][curPoint.getX()+x] = curPoint.getCount();
			
			System.out.println((curPoint.getX()+x) + "   " + (curPoint.getY()+y) + "   " + curPoint.getCount());
		}
	}
	
	

}
