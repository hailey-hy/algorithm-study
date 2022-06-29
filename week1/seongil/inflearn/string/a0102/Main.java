package week1.seongil.inflearn.string.a0102;

import java.util.Scanner;

/**
 * 대소문자 변환
 * 
 * @author Seongil, Yoon
 *
 */
public class Main {
	public static String solution(String str) {
		StringBuffer answer = new StringBuffer();

//		for (char c : str.toCharArray()) {
//			if (Character.isLowerCase(c)) {
//				answer.append(Character.toUpperCase(c));
//			} else {
//				answer.append(Character.toLowerCase(c));
//			}
//		}

		// ASCII 방식
		// 65(A) ~ 90(Z), 97(a) ~ 122(z)
		for (char c : str.toCharArray()) {
			if (c >= 65 && c <= 90) { //대문자
				answer.append((char) (c + 32));
//				answer.append(Character.toLowerCase(c));
			} else if (c >= 97 && c <= 122) { //소문자
				answer.append((char) (c - 32));
//				answer.append(Character.toUpperCase(c));
			}
		}

		return answer.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.print(solution(str));
	}
}