package week1.jungmin.inflearn._1string._0112;
import java.util.Scanner;
  
//암호
//week3_day5: 220715
//time: 155ms
//Memory: 27mb
//소요시간: 35

// 65~90

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input = in.nextLine();
    int input1 = Integer.parseInt(input);
    String input2 = in.nextLine();
    
    // 전체 한 번에 바꾸기 
    input2 = input2.replace("#", "1");
    input2 = input2.replace("*", "0");

    // 결과 담을 버퍼
    StringBuffer result = new StringBuffer();
    
    //일곱자리씩 나누기
    for (int i = 0; i < input1; i++) {
		String string = input2.substring(i*7, (i+1)*7);
		
		// 십진수로 변환 
		int newDecimal = 0;
		
		for (int j = 0; j < 7; j++) {
			String string2 = string.substring(j, j + 1);
			int temp = Integer.parseInt(string2);
			// 제곱 
			double temp2 = temp * Math.pow(2, 6-j);
			newDecimal += temp2;
		}
		
		// int -> 아스키 코드  
		char ch = (char)newDecimal;

		result.append(ch);
	}
    
    System.out.println(result);
  }
}