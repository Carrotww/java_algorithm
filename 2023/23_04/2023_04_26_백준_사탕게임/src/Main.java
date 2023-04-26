// https://www.acmicpc.net/problem/3085

import java.io.*;
import java.util.*;

public class Main {
	public static char[][] graph;
	public static int N;
	public static int result;

	public static void check() {
		for (int i = 0; i < N; i++) {
			int cnt = 1;
			for (int j = 1; j < N; j++) {
				if (graph[i][j-1] == graph[i][j]) {
					cnt += 1;
					if (result < cnt) {
						result = cnt;
					}
				}
				else {
					cnt = 1;
				}
			}

			cnt = 1;
			for (int j = 1; j < N; j++) {
				if (graph[j-1][i] == graph[j][i]) {
					cnt += 1;
					if (result < cnt) {
						result = cnt;
					}
				}
				else {
					cnt = 1;
				}
			}
		}
	}

    public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    N = Integer.parseInt(br.readLine());

		graph = new char[N][N];
		String temp;
		for (int i = 0; i < N; i++) {
			temp = br.readLine();
			graph[i] = temp.toCharArray();
		}

		for (int row = 0; row < N; row++) {
			for (int col = 0; col < N; col++) {
				if (row < N-1) {
					char t = graph[row][col];
					graph[row][col] = graph[row+1][col];
					graph[row+1][col] = t;
					check();
					t = graph[row][col];
					graph[row][col] = graph[row+1][col];
					graph[row+1][col] = t;
				}

				if (col < N-1) {
					char t = graph[row][col];
					graph[row][col] = graph[row][col+1];
					graph[row][col+1] = t;
					check();
					t = graph[row][col];
					graph[row][col] = graph[row][col+1];
					graph[row][col+1] = t;
				}
			}
		}

		// System.out.println(Arrays.deepToString(graph));
		System.out.println(result);
    }
}