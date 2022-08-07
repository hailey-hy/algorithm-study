package week1.seongil.inflearn._2array._0204;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2.4. 피보나치 수열
 * 
 * @author Seongil, Yoon
 *
 */
class Main {
	public int solution(int n) {
		int cnt = 0;
		int[] ch = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			if (ch[i] == 0) {
				cnt++;
				for (int j = i; j <= n; j = j + i)
					ch[j] = 1;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}

//class Main {	
//	public void solution(int n){
//		int a=1, b=1, c;
//		System.out.print(a+" "+b+" ");
//		for(int i=2; i<n; i++){
//			c=a+b;
//			System.out.print(c+" ");
//			a=b;
//			b=c;
//		}
//	}
//	public static void main(String[] args){
//		Main T = new Main();
//		Scanner kb = new Scanner(System.in);
//		int n=kb.nextInt();
//		T.solution(n);
//	}
//}