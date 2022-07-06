package week1.jungmin.inflearn._1string._0108;

// 유효한 팰린드롬
//week2_day3: 220706
//time: 154ms
//Memory: 27mb
//소요시간: 22

import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input = in.nextLine();
    
    char[] inputArr = input.toCharArray();
    // 문자열만 담을 공백 문자열 
    String inputNew = "";
    
    for (int i = 0; i < inputArr.length; i++) {
		int c = inputArr[i]; // char -> ascii
		if(c >= 65) { // 문자열인 경우에만 
			inputNew += inputArr[i]; // char도 더해지는구나 
		}
	}
    
    // 이제 펠린드롬
    String[] inputArr2 = inputNew.split("");
    for (int i = 0; i < (inputArr2.length-1)/2; i++) {
		if (!inputArr2[i].equalsIgnoreCase(inputArr2[inputArr2.length-1-i])) {
			// 한 번이라도 다르게 나오면 끊기 
			System.out.println("NO");
			return;
		}
	}
    System.out.println("YES");
    return;
  }
}