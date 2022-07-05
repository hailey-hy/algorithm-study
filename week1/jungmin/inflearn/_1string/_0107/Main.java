package week1.jungmin.inflearn._1string._0107;

// 회문 문자열 
//week2_day2: 220705
//time: 158ms
//Memory: 27mb
//소요시간: 12

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    
    String[] inputArr = input.split("");
    
    // 아이디어: 절반을 갈라서 앞 뒤 한개씩 비교(홀, 짝 여부 무관)
    for (int i = 0; i < input.length()/2; i++) {
    	if (!inputArr[i].equalsIgnoreCase(inputArr[inputArr.length-1-i])) {
			System.out.println("NO");
			return;
		}
	}
	System.out.println("YES");
	return;    
  }
}