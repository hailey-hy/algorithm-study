package week1.seongil.inflearn._1string._0103;

import java.util.Scanner;

/**
 * 문장 속 단어(indexOf(), substring())
 * 
 * @author Seongil, Yoon
 *
 */
public class Main {
	// split방식
//	public static String solution(String str) {
//		String answer = ""; // 가장 긴 단어 저장
//		int m = Integer.MIN_VALUE;
//
//		String[] strSplit = str.split(" ");
//
//		for (String s : strSplit) {
//			int len = s.length();
//			if (len > m) {
//				m = len;
//				answer = s;
//			}
//		}
//
//		return answer;
//	}

	public static String solution(String str) {
		String answer = ""; // 가장 긴 단어 저장
		int m = Integer.MIN_VALUE;
		int pos = 0;

		while ((pos = str.indexOf(" ")) != -1) {
//			it is time to study
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if (len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1); // 공백 다음 문자열을 잘라내서 다시 반복시킴
		}
		// 마지막 문장은 다음 공백이 없어서 끝나버려서 반복문 종료 후 따로 처리해야됨
		if (str.length() > m)
			answer = str;

		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(solution(str));
	}
}