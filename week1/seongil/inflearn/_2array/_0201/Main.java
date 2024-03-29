package week1.seongil.inflearn._2array._0201;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2.1 큰 수 출력하기
 * 
 * @author Seongil, Yoon
 *
 */
class Main {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1])
				answer.add(arr[i]);
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
		for (int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}