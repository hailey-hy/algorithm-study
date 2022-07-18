package week1.jungmin.inflearn._2array;
import java.util.Scanner;

//큰 수 출력하기
//week4_day1: 220718
//time: 152ms
//Memory: 27mb
//소요시간: 25

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    
    String input1 = in.nextLine();
    int num = Integer.parseInt(input1);
    
    String input2 = in.nextLine();
    
    String[] arr = input2.split(" ");
    
    // 결과담는 버퍼
    StringBuffer result = new StringBuffer();
    
    // 첫 번째 값은 담고 시작
    result.append(arr[0]);
    
    for (int i = 1; i < arr.length; i++) {
    	int back = Integer.parseInt(arr[i]);
    	int front = Integer.parseInt(arr[i-1]);
		if (back > front) {
			result.append(" " + back);
		}
	}
    System.out.println(result);
  }
}