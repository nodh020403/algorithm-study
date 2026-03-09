import java.io.*;
import java.util.*;

public class Main{
	static int N;
	static int[][] house;
	static boolean[][] visited;
	static int counting;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		house = new int[N][N];
		visited = new boolean[N][N];
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++) {
				house[i][j] = line.charAt(j) - '0';
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (house[i][j]==1 && visited[i][j] == false) {
					counting = 0;
					dfs(i,j);
					list.add(counting);
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		for (int a : list) {
			System.out.println(a);
		}
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;
		counting++;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if (house[nx][ny]==1 && !visited[nx][ny]) {
					dfs(nx, ny);
				}
			}

		}
	}
}