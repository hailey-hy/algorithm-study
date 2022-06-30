package week1.jungmin.inflearn._1string._0105;
import java.util.Scanner;
  
//day2: 220630
//time: 165ms
//Memory: 27mb
//소요시간: 30 -> 이유)replace는 위치기반이 아니라, 값기반이므로 유의 
//해결 x 

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input = in.nextLine();
    
    char[] inputChar = input.toCharArray();
    
    String result = "";
    
    for (int i = 0; i < input.length(); i++) { // 구조가 대칭일 수 밖에 
    	int asc = inputChar[i]; // char -> ascii
    	if (asc > 64) { // 65 부턴 문자 
//			result += input.charAt(input.length()-i-1);
			result += input.substring(input.length()-i-1, input.length()-i);		

		    
			// result = result.replace(result.charAt(result.length()-1-i), temp);
		}
		else {
//			result += input.charAt(i);
			result += input.substring(i, i+1);

		}
	}
    System.out.println(result);
  }
}