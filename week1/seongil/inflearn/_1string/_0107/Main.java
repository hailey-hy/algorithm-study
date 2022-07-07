package week1.seongil.inflearn._1string._0107;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 7. 회문문자열
 * 
 * @author Seongil, Yoon
 *
 */
public class Main {

	public static String solution(String str) {
		String answer = "YES";
		int len = str.length();

		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i)) {
				return "NO";
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(solution(str));
	}
}