package week1.seongil.inflearn._2array._0202;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2.2. 보이는 학생
 * 
 * @author Seongil, Yoon
 *
 */
class Main {
	public int solution(int n, int[] arr) {
		int answer = 1, max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				answer++;
			}
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
		System.out.print(T.solution(n, arr));
	}
}