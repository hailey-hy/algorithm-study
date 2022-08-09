package week1.seongil.inflearn._2array._0208;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2.8. 등수구하기
 * 
 * @author Seongil, Yoon
 *
 */
class Main {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i])
					cnt++;
			}
			answer[i] = cnt;
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int x : T.solution(n, arr))
			System.out.print(x + " ");
	}
}