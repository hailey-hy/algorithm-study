package week1.jungmin.inflearn._1string._0102;

import java.util.Scanner;
  
//day1: 220629
// time: 162ms
// Memory: 27mb
//소요시간: 10

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();

    String input_lower = input.toLowerCase();
    
    String result = "";
    
    for (int i = 0; i < input.length(); i++) {
		if ((input.substring(i, i+1).equals(input_lower.substring(i, i+1)))) {
			result += input.toUpperCase().substring(i, i+1);
		}
		else {
			result += input_lower.substring(i, i+1);
		}
	}
    System.out.println(result);
  }
}