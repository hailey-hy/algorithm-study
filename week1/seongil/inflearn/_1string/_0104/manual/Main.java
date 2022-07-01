package week1.seongil.inflearn._1string._0104.manual;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4. 단어 뒤집기(직접뒤집기)
 * 
 * @author Seongil, Yoon
 *
 */
public class Main {

	public static ArrayList<String> solution(String[] str) {
		ArrayList<String> answer = new ArrayList<String>(); // (변수는 스택영역, 객체는 힙영역에 있음)

		for (String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length() - 1;
			while (lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			} // end of while
			String tmp = String.valueOf(s); // static 메서드(클래스영역에 있음)
			answer.add(tmp);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i = 0;
		String[] str = new String[n];

//		System.out.println("===== 단어를 입력해주세요 =====");
		do {
			str[i] = sc.next();
//			str[i] = sc.nextLine();
//			nextInt()가 버퍼의 내용을 가져올 때 분리자를 제외하고 가져오기 때문에 1234만 가져오게 된다. 
//			그러면 버퍼에 \n이 남아있게 되는데 nextLine()은 공백과 개행문자(Enter)인 분리자를 포함시키기 때문에 \n만 가져오고 프로그램이 종료되는 것이다.
//			System.out.println(str[i]);
//			System.out.println("i : " + i + ", n : " + n);
			i++;
		} while (i < n);

//		System.out.println("===== 뒤집어진 단어 =====");
		for (String s : solution(str)) {
			System.out.println(s);
		}
	}
}