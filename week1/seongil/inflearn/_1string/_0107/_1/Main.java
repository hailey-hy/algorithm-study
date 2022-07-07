package week1.seongil.inflearn._1string._0107._1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 7. 회문문자열(StringBuilder)
 * 
 * @author Seongil, Yoon
 *
 */
public class Main {

	public static String solution(String str) {
		String tmp = new StringBuilder(str).reverse().toString();

		if (str.equalsIgnoreCase(tmp))
			return "YES";
		else
			return "NO";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(solution(str));
	}
}