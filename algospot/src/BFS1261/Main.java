package BFS1261;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Vertex implements Comparable<Vertex>{
	private int x;
	private int y;
	private int count;
	
	public int getCount() {
		return count;
	}


	public Vertex(int x, int y, int count) {
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
	public int compareTo(Vertex node) {
		if(this.count > node.count) {
			return 1;
		} else if(this.count < node.count) {
			return -1;
		}
		return 0;
	}
}



public class Main {
	static int node[][] = new int[100][100];
	static int count[][] = new int[100][100];
	static boolean visited[][] = new boolean[100][100];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		String widthHeight[] = input1.split(" ");
		
		// 3 4  . 3열 4행.
		int width = Integer.parseInt(widthHeight[0]);
		int height = Integer.parseInt(widthHeight[1]);
		
		inputMethod(node,width,height,br);
		
		// 초기화
		visited[0][0] = true;
		count[0][0]=0;
		
		PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
		Vertex v = new Vertex(0,0,0);
		
		queue.offer(v);
		
		while(!queue.isEmpty()) {
			Vertex curVertex = queue.poll();
			
			// 우선순위큐로 구현했기 때문에 visited가 true인 경우를 고려할 필요가 없다.
			// count가 가장 낮은걸 우선으로 큐가 먼저 poll되기 때문에 맨마지막에 도착했을때
			// 마지막 count[][]에서 가장 작은 count를 가지게 된다.
			
			if(curVertex.getX() + 1 < width) {  // 배열의 x + 1은 뒤에 [] 가 증가해야한다.
				if(visited[curVertex.getY()][curVertex.getX()+1] == false) {
					visited[curVertex.getY()][curVertex.getX()+1] = true;
					if(node[curVertex.getY()][curVertex.getX()+1] == 1) {
						queue.offer(new Vertex(curVertex.getX()+1, curVertex.getY(), curVertex.getCount()+1));
						count[curVertex.getY()][curVertex.getX()+1] = curVertex.getCount()+1;
					}else {
						queue.offer(new Vertex(curVertex.getX()+1, curVertex.getY(), curVertex.getCount()));
						count[curVertex.getY()][curVertex.getX()+1] = curVertex.getCount();
					}
				
					
				}
				
//				if(node[curVertex.getY()][curVertex.getX()+1] == 1) {
////					count[curVertex.getY()][curVertex.getX()+1] = Math.min(curVertex.getCount()+1, count[curVertex.getY()][curVertex.getX()+1]);
//					count[curVertex.getY()][curVertex.getX()+1] = curVertex.getCount()+1;
//				}else {
////					count[curVertex.getY()][curVertex.getX()+1] = Math.min(curVertex.getCount(), count[curVertex.getY()][curVertex.getX()+1]);
//					count[curVertex.getY()][curVertex.getX()+1] = curVertex.getCount();
//				}
				
			}
			
			if(curVertex.getY() + 1 < height) {  // 배열의 x + 1은 뒤에 [] 가 증가해야한다.
				if(visited[curVertex.getY()+1][curVertex.getX()] == false) {
					visited[curVertex.getY()+1][curVertex.getX()] = true;
					if(node[curVertex.getY()+1][curVertex.getX()] == 1) {
						queue.offer(new Vertex(curVertex.getX(), curVertex.getY()+1, curVertex.getCount()+1));
						count[curVertex.getY()+1][curVertex.getX()] = curVertex.getCount()+1;
					}else {
						queue.offer(new Vertex(curVertex.getX(), curVertex.getY()+1, curVertex.getCount()));
						count[curVertex.getY()+1][curVertex.getX()] = curVertex.getCount();
					}
					
				}
				
//				if(node[curVertex.getY()+1][curVertex.getX()] == 1) {
////					count[curVertex.getY()+1][curVertex.getX()] = Math.min(curVertex.getCount()+1, count[curVertex.getY()+1][curVertex.getX()]);
//					count[curVertex.getY()+1][curVertex.getX()] = curVertex.getCount()+1;
//				}else {
////					count[curVertex.getY()+1][curVertex.getX()] = Math.min(curVertex.getCount(), count[curVertex.getY()+1][curVertex.getX()]);
//					count[curVertex.getY()+1][curVertex.getX()] = curVertex.getCount();
//				}
				
			}
			
			if(curVertex.getX() - 1 > -1) {  // 배열의 x + 1은 뒤에 [] 가 증가해야한다.
				if(visited[curVertex.getY()][curVertex.getX()-1] == false) {
					visited[curVertex.getY()][curVertex.getX()-1] = true;
					if(node[curVertex.getY()][curVertex.getX()-1] == 1) {
						queue.offer(new Vertex(curVertex.getX()-1, curVertex.getY(), curVertex.getCount()+1));
						count[curVertex.getY()][curVertex.getX()-1] = curVertex.getCount()+1;
					}else {
						queue.offer(new Vertex(curVertex.getX()-1, curVertex.getY(), curVertex.getCount()));
						count[curVertex.getY()][curVertex.getX()-1] = curVertex.getCount();
					}
					
				}
				
//				if(node[curVertex.getY()][curVertex.getX()-1] == 1) {
////					count[curVertex.getY()][curVertex.getX()-1] = Math.min(curVertex.getCount()+1, count[curVertex.getY()][curVertex.getX()-1]);
//					count[curVertex.getY()][curVertex.getX()-1] = curVertex.getCount()+1;
//				}else {
////					count[curVertex.getY()][curVertex.getX()-1] = Math.min(curVertex.getCount(), count[curVertex.getY()][curVertex.getX()-1]);
//					count[curVertex.getY()][curVertex.getX()-1] = curVertex.getCount();
//				}
				
			}
			
			if(curVertex.getY() - 1 > -1) {  // 배열의 x + 1은 뒤에 [] 가 증가해야한다.
				if(visited[curVertex.getY()-1][curVertex.getX()] == false) {
					visited[curVertex.getY()-1][curVertex.getX()] = true;
					if(node[curVertex.getY()-1][curVertex.getX()] == 1) {
						queue.offer(new Vertex(curVertex.getX(), curVertex.getY()-1, curVertex.getCount()+1));
						count[curVertex.getY()-1][curVertex.getX()] = curVertex.getCount()+1;
					}else {
						queue.offer(new Vertex(curVertex.getX(), curVertex.getY()-1, curVertex.getCount()));
						count[curVertex.getY()-1][curVertex.getX()] = curVertex.getCount();
					}
					
				}
				
//				if(node[curVertex.getY()-1][curVertex.getX()] == 1) {
////					count[curVertex.getY()-1][curVertex.getX()] = Math.min(curVertex.getCount()+1, count[curVertex.getY()-1][curVertex.getX()]);
//					count[curVertex.getY()-1][curVertex.getX()] = curVertex.getCount()+1;
//				}else {
////					count[curVertex.getY()-1][curVertex.getX()] = Math.min(curVertex.getCount(), count[curVertex.getY()-1][curVertex.getX()]);
//					count[curVertex.getY()-1][curVertex.getX()] = curVertex.getCount();
//				}
				
			}
			
			
			
		}
		
		
		System.out.println(count[height-1][width-1]);
		

	}
	
	
	
	
	
	public static void inputMethod(int[][] node, int width, int height, BufferedReader br) throws IOException {
		
		
		for(int i=0 ; i < height ; i++) {
			String nodeContent = br.readLine();
			
			for(int j=0 ; j < width ; j++) {
				String temp = Character.toString(nodeContent.charAt(j));
				node[i][j] = Integer.parseInt(temp);
				
			}
		}	
	}

}
