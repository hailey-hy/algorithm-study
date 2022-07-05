package week1.seongil.inflearn._1string._0106;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. 중복문자제거
 * 
 * @author Seongil, Yoon
 *
 */
public class Main {

	public static String solution(String str) {
		StringBuilder answer = new StringBuilder();

		// indexOf : 문자열을 찾기
		for (int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i) + " : " + +i + " : " + str.indexOf(str.charAt(i)));
			if (str.indexOf(str.charAt(i)) == i) {
				answer.append(str.charAt(i));
			}
		}

		return answer.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(solution(str));
	}
}