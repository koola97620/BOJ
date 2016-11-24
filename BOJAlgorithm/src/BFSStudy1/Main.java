package BFSStudy1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node {
	private int x;
	private int y;
	private int depth;
	public Node(int x, int y,int depth) {
		this.x = x;
		this.y = y;
		this.depth = depth;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}


public class Main {
	// 말 움직인다?? 라고 생각하지 말고 말이 밟고 지나간 자리를 기억해 놓는다고 생각하자.
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String input2[] = input.split(" ");
		
		int height = Integer.parseInt(input2[0]);
		int width = Integer.parseInt(input2[1]);
		
		int pan[][] = new int[height][width];
		boolean visited[][] = new boolean[height][width];
		
		//초기화.
		visited[0][0] = true;
		Node node = new Node(0,0,1);
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.offer(node);
		
		// 반복 횟수.
		int count=0;
		int visitedCount=0;
		
		while(!queue.isEmpty()) {
			
			// node의 x y 이동과 visited의 배열은 xy가 반대다.

			
			
			Node curNode = queue.poll();
			
			if(curNode.getX()+2 < width && curNode.getY()+1 < height) {
				if(visited[curNode.getY()+1][curNode.getX()+2] == false) {
					queue.offer(new Node(curNode.getX()+2, curNode.getY()+1 , curNode.getDepth()+1));
					visited[curNode.getY()+1][curNode.getX()+2] = true;
					visitedCount++;
				}
//				else {
//					queue.offer(new Node(curNode.getX()+2, curNode.getY()+1));
//				}
				
			}
			
			
			if(curNode.getX()+1 < width && curNode.getY()+2 < height) {
				if(visited[curNode.getY()+2][curNode.getX()+1] == false) {
					queue.offer(new Node(curNode.getX()+1, curNode.getY()+2 , curNode.getDepth()+1));
					visited[curNode.getY()+2][curNode.getX()+1] = true;
					visitedCount++;
				}
//				else {
//					queue.offer(new Node(curNode.getX()+1, curNode.getY()+2));
//				}
				
			}
			
			
			
			if(curNode.getX()-2 > -1 && curNode.getY()+1 < height) {
				if(visited[curNode.getY()+1][curNode.getX()-2] == false) {
					queue.offer(new Node(curNode.getX()-2, curNode.getY()+1 , curNode.getDepth()+1));
					visited[curNode.getY()+1][curNode.getX()-2] = true;
					visitedCount++;
				} 
//				else {
//					queue.offer(new Node(curNode.getX()-2, curNode.getY()+1));
//				}
				
			}
			
			
			
			if(curNode.getX()-1 > -1 && curNode.getY()+2 < height) {
				if(visited[curNode.getY()+2][curNode.getX()-1] = false) {
					queue.offer(new Node(curNode.getX()-1, curNode.getY()+2 , curNode.getDepth()+1));
					visited[curNode.getY()+2][curNode.getX()-1] = true;
					visitedCount++;
				} 
//				else {
//					queue.offer(new Node(curNode.getX()-1, curNode.getY()+2));
//				}
				
			}
			
			
			
			if(curNode.getX()+2 < width && curNode.getY()-1 > -1) {
				if(visited[curNode.getY()-1][curNode.getX()+2] ==false) {
					queue.offer(new Node(curNode.getX()+2, curNode.getY()-1 , curNode.getDepth()+1));
					visited[curNode.getY()-1][curNode.getX()+2] = true;
					visitedCount++;
				} 
//				else {
//					queue.offer(new Node(curNode.getX()+2, curNode.getY()-1));
//				}
				
			}
			
			
			if(curNode.getX()+1 < width && curNode.getY()-2 > -1) {
				if(visited[curNode.getY()-2][curNode.getX()+1] == false) {
					queue.offer(new Node(curNode.getX()+1, curNode.getY()-2 , curNode.getDepth()+1));
					visited[curNode.getY()-2][curNode.getX()+1] = true;
					visitedCount++;
				} 
//				else {
//					queue.offer(new Node(curNode.getX()+1, curNode.getY()-2));
//				}
				
			}
			
			
			if(curNode.getX()-1 >-1 && curNode.getY()-2 >-1) {
				if(visited[curNode.getY()-2][curNode.getX()-1]== false) {
					queue.offer(new Node(curNode.getX()-1, curNode.getY()-2 , curNode.getDepth()+1));
					visited[curNode.getY()-2][curNode.getX()-1] = true;
					visitedCount++;
				} 
//				else {
//					queue.offer(new Node(curNode.getX()-1, curNode.getY()-2));
//				}
				
			}
			
			
			if(curNode.getX()-2 > -1 && curNode.getY()-1 > -1) {
				if(visited[curNode.getY()-1][curNode.getX()-2] == false) {
					queue.offer(new Node(curNode.getX()-2, curNode.getY()-1 , curNode.getDepth()+1));
					visited[curNode.getY()-1][curNode.getX()-2] = true;
					visitedCount++;
				} 
//				else {
//					queue.offer(new Node(curNode.getX()-2, curNode.getY()-1));
//				}
				
			}
			
			
			
			if(visitedCount == width * height) {
				System.out.println("visited all true , how many times : " + curNode.getDepth());
				return;
			}
			
			
			
			count++;
			
		
			
			// 매번 어떻게 변하는지 출력하기
//			for(int i=0 ; i < height ; i++) {
//				for(int j=0 ; j < width ; j++) {
//					if(visited[i][j] == true)
//						System.out.print(1 + " ");
//					else
//						System.out.print(0 + " ");
//				}
//				System.out.println();
//			}
//			
//			String pause = br.readLine();
			
			
		}
//		for(int i=0 ; i < height ; i++) {
//			for(int j=0; j < width ; j++) {
//				if(visited[i][j]==true) {
//					visitedCount++;
//					System.out.println("dd");
//				}
//			}
//		}
		
		
		
		
		
		
		
		
		
		
	}

}
