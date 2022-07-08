package week1.seongil.inflearn._1string._0108;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 8. 유효한 팰린드롬
 * 
 * @author Seongil, Yoon
 *
 */
public class Main {

	public static String solution(String str) {
		// found7, time: study; Yduts; emit, 7Dnuof
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();

		System.out.println(str);
		System.out.println(tmp);
		if (str.equals(tmp))
			answer = "YES";
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(solution(str));
	}
}