import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] game = new int[n][n];
		int[][] play = new int[n][n];
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < n; j++) {
				char a = line.charAt(j);
				if (a == '*') {
					game[i][j] = 1;
				} else {
					game[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < n; j++) {
				char a = line.charAt(j);
				if (a == 'x') {
					play[i][j] = 1;
				} else {
					play[i][j] = 0;
				}
			}
		}

		boolean bomb = false;
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				if ((game[j][k] == 1) && (play[j][k] == 1)) {
					bomb = true;
				}
			}
		}

		int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (bomb && game[i][j] == 1) {
					System.out.print("*");
				} else if (play[i][j] == 1) {
					int count = 0;

					for (int d = 0; d < 8; d++) {
						int nx = i + dx[d];
						int ny = j + dy[d];
						if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
							if (game[nx][ny] == 1) {
								count++;
							}
						}
					}
					System.out.print(count);
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
}
