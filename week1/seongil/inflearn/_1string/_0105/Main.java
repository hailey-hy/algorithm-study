package week1.seongil.inflearn._1string._0105;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 5. 특정 문자 뒤집기
 * 
 * @author Seongil, Yoon
 *
 */
public class Main {

	public static String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length() - 1;
		while (lt < rt) {
			if (!Character.isAlphabetic(s[lt]))
				lt++;
			else if (!Character.isAlphabetic(s[rt]))
				rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(solution(str));
	}
}