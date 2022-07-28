package week1.jungmin.inflearn._2array._0205;

//소수(에라토스테네스 체)
//week5_day4: 220728
//선생님 코드 
//실패 

import java.util.*;
class Main {	
	public int solution(int n){
		int cnt=0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++){
			if(ch[i]==0){
				cnt++;
				for(int j=i; j<=n; j=j+i) ch[j]=1;
			}
		}
		return cnt;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		System.out.println(T.solution(n));
	}
}