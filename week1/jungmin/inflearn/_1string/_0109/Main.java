package week1.jungmin.inflearn._1string._0109;
import java.util.Scanner;

//숫자만 추출
//week2_day3: 220706
//time: 157ms
//Memory: 27mb
//소요시간: 25

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input = in.nextLine();
    
    // ascii code 얻는 방법: String -> char[] 만들기 -> char을 int로 받기 
    char[] inputArr = input.toCharArray();

    String result = "";
    
    for (int i = 0; i < inputArr.length; i++) {
    	int c = inputArr[i];
    	if (c >= 48 && c <= 57) { // ascii에서 숫자는 48~57
    		result += inputArr[i]; // String에 char 더하기 가능     			
		}
	}
    
    // 0 처리 
    for (int i = 0; i < result.length(); i++) {
    	if (result.substring(0, 1).equals("0")) {
    		result = result.substring(1);
		}
    }
    
    System.out.println(result);
  }
}