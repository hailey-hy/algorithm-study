package week1.seongil.inflearn._2array._0212;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2.12. 멘토링
 * 
 * @author Seongil, Yoon
 *
 */
class Main {
	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int cnt = 0;
				for (int k = 0; k < m; k++) {
					int pi = 0, pj = 0;
					for (int s = 0; s < n; s++) {
						if (arr[k][s] == i)
							pi = s;
						if (arr[k][s] == j)
							pj = s;
					}
					if (pi < pj)
						cnt++;
				}
				if (cnt == m) {
					answer++;
					// System.out.println(i+" "+j);
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}
}