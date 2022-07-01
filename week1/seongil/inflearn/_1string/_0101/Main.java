package week1.seongil.inflearn._1string._0101;

import java.util.Scanner;

/**
 * 문자열 찾기 
 * @author Seongil, Yoon
 *
 */
public class Main {
	public static int solution(String str, char t) {
		int answer = 0;

		// 대소문자를 구분하지 않아서 대문자로 통일
		str = str.toUpperCase();
		t = Character.toUpperCase(t);

//		for (int i = 0; i < str.length(); i++) {
//			if (t == str.charAt(i)) // char와 char를 비교
//				answer++;
//		}

		for (char x : str.toCharArray()) {
			// x가 배열을 순차접근
			// x가 기초형이라서 string의 메서드 사용 불가능
			if (x == t)
				answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next(); // 콘솔에서 1번째 행 input
		char c = in.next().charAt(0); // 콘솔에서 2번째 행의 0번째 문자 input
		System.out.print(solution(str, c));
	}
}
