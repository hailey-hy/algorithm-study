package week1.seongil.inflearn._1string._0104;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4. 단어 뒤집기(StringBuilder이용법)
 * 
 * @author Seongil, Yoon
 *
 */
public class Main {

	public static ArrayList<String> solution(String[] str) {
		ArrayList<String> answer = new ArrayList<String>();

//		StringBuilder, StringBuffer
//		그렇다면 동일한 API를 가지고 있는 StringBuffer, StringBuilder의 차이점은 무엇일까요?
//		가장 큰 차이점은 동기화의 유무로써 StringBuffer는 동기화 키워드를 지원하여 멀티쓰레드 환경에서 안전하다는 점(thread-safe) 입니다.  
//		참고로 String도 불변성을 가지기때문에 마찬가지로  멀티쓰레드 환경에서의 안정성(thread-safe)을 가지고 있습니다. 
//		반대로 StringBuilder는 동기화를 지원하지 않기때문에 
//		멀티쓰레드 환경에서 사용하는 것은 적합하지 않지만 동기화를 고려하지 않는 만큼 단일쓰레드에서의 성능은 StringBuffer 보다 뛰어납니다.
		for (String s : str) {
			String tmp = new StringBuilder(s).reverse().toString();
//			String tmp = new StringBuffer(s).reverse().toString();
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