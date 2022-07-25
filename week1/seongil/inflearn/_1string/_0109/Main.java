package week1.seongil.inflearn._1string._0109;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 9. 숫자만 추출
 * 
 * @author Seongil, Yoon
 *
 */
class Main {
	public int solution(String s) {
		// int answer=0;
		String answer = "";
		for (char x : s.toCharArray()) {
			// if(x>=48 && x<=57) answer=answer*10+(x-48);
			/*if(Character.isDigit(x)){
				answer=answer*10+ Character.getNumericValue(x);
			}*/
			if (Character.isDigit(x))
				answer += x;
		}
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}