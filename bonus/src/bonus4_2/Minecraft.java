package bonus4_2;
import java.util.LinkedList;
import java.util.Queue;
public class Minecraft {
	public static boolean canGo(World w,Slime s,Food f) {
		int[] dx = {0, 1, 0, -1};
		int[] dy = {-1, 0, 1, 0};
		boolean [][] visited = new boolean[w.getX()][w.getY()];
		Queue <int[]> q = new LinkedList<>();
		
		q.add(new int[] {s.getX(),s.getY(),s.getXp()});
		visited[s.getX()][s.getY()] = true;
		
		while(!q.isEmpty()) {
			int[] current = q.poll();
			int x = current[0];
			int y = current[1];
			int xp = current[2];
			
			if(x== f.getX() && y == f.getY()) {
				return true;
			}
			
			if(xp<=0) {
				continue;
			}
			
			for(int i=0;i<4;i++) {
				int newX = x + dx[i];
				int newY = y+ dy[i];
				
				if(newX >= 0 && newX<w.getX() && newY>= 0 && newY < w.getY() && visited[newX][newY]) {
					visited[newX][newY] = true;
					q.add(new int[] {newX,newY,xp-1});
				}
			}
		}
		return false;
	}
}
